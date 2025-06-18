package service;

import model.*;
import model.enums.ParkingSlotStatus;
import repository.*;
import service.Strategy.SlotAllocationStrategy.SlotAllocationStrategy;

import java.time.LocalDateTime;

public class TicketService {

    private TicketRepository ticketRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private  GateRepository gateRepository;

    public TicketService(TicketRepository ticketRepository, ParkingSlotRepository parkingSlotRepository, ParkingLotRepository parkingLotRepository,
                         ParkingFloorRepository parkingFloorRepository, GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingSlotRepository = parkingSlotRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.gateRepository = gateRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId,int parkingLotId) {
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        SlotAllocationStrategy strategy = parkingLot.getSlotAllocationStrategy();
        ParkingSlot parkingSlot = strategy.allocateSlot(parkingLot, vehicle);
        Gate gate = gateRepository.get(gateId);

        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.UNAVAILABLE);
        parkingSlot.setVehicle(vehicle);
        parkingSlotRepository.put(parkingSlot);

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryGate(gate);
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSlots(parkingSlot);


        ticketRepository.put(ticket);
        return ticket;
    }

    public Ticket getTicketById(int ticketId) {
        return ticketRepository.getTicket(ticketId);
    }
}
