package service;

import model.*;
import model.enums.BillStatus;
import model.enums.GateStatus;
import model.enums.GateType;
import model.enums.ParkingSlotStatus;
import repository.BillRepository;
import repository.ParkingLotRepository;
import repository.ParkingSlotRepository;
import service.Strategy.BillCalculationStrategy.BillCalculationStrategy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BillService {

    private BillRepository billRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public BillService(BillRepository billRepository, ParkingLotRepository parkingLotRepository, ParkingSlotRepository parkingSlotRepository) {
        this.billRepository = billRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    public Bill generateBill(Ticket ticket,int parkingLotId) {
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        BillCalculationStrategy strategy = parkingLot.getBillCalculationStrategies();

        ParkingSlot parkingSlot = ticket.getParkingSlots();
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.AVAILABLE);
        parkingSlot.setVehicle(null);

        parkingSlotRepository.put(parkingSlot);

        int amount = strategy.calculate(ticket);

        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setExitTime(LocalDateTime.now());
        Gate exitgate = new Gate(ticket.getEntryGate().getId()+1, GateType.EXIT, GateStatus.OPEN,"vinod");
        bill.setExitGate(exitgate);
        bill.setBillStatus(BillStatus.UNPAID);
        bill.setTicket(ticket);

        billRepository.put(bill);

        return bill;
    }
}
