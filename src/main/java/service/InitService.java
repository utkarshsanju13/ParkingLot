package service;

import model.Gate;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSlot;
import model.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSlotRepository;
import service.Strategy.BillCalculationStrategy.BIllCalculationFactory;
import service.Strategy.BillCalculationStrategy.BillCalculationStrategy;
import service.Strategy.SlotAllocationStrategy.LinerSlotAllocationStrategy;
import service.Strategy.SlotAllocationStrategy.SlotAllocationFactory;

import java.util.ArrayList;
import java.util.List;

public class InitService {

    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private GateRepository gateRepository;

    public InitService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSlotRepository parkingSlotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSlotRepository = parkingSlotRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init() {

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setParkingLotName("Radhe Parking lot");
        parkingLot.setAddress("Near bhawapur tanki ..");
        parkingLot.setCapacity(100);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setSlotAllocationStrategy(SlotAllocationFactory.getSlotAllocationStrategy(SlotAllocationType.LINER_SLOT_ALLOCATION));
        parkingLot.setBillCalculationStrategies(BIllCalculationFactory.getBillCalculationStrategy(BillCalculationType.SIMPLE_BILL_CALCULATION));

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            ParkingFloor pf = new ParkingFloor();
            pf.setId(i);
            pf.setFloorNumber(i);
            pf.setParkingFloorStatus(ParkingFloorStatus.OPEN);

            Gate entryGate = new Gate();
            entryGate.setGateNumber(i*1000 + 1);
            entryGate.setId(i*1000 + 1);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setStatus(GateStatus.OPEN);
            pf.setEntryGate(entryGate);
            gateRepository.put(i*1000 + 1,entryGate);


            Gate exitGate = new Gate();
            exitGate.setGateNumber(i*1000 + 2);
            exitGate.setId(i*1000 + 2);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setStatus(GateStatus.OPEN);
            pf.setExitgate(exitGate);
            gateRepository.put(i*1000 + 2,exitGate);

            List<ParkingSlot> parkingSlots = new ArrayList<>();
            for(int j = 1; j<= 10; j++){
                ParkingSlot parkingSlot = new ParkingSlot();
                parkingSlot.setId(i*100 + j);
                parkingSlot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSlot.setParkingNumber(i*100 + j);
                parkingSlot.setParkingSlotStatus(ParkingSlotStatus.AVAILABLE);
                parkingSlots.add(parkingSlot);
                parkingSlotRepository.put(parkingSlot);
            }
            pf.setParkingSlotsList(parkingSlots);
            parkingFloors.add(pf);
            parkingFloorRepository.put(pf);
        }
        parkingLot.setParkingFloorList(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLot;
    }
}
