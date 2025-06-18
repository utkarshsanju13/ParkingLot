package service.Strategy.SlotAllocationStrategy;

import model.ParkingLot;
import model.ParkingSlot;
import model.Vehicle;

public interface SlotAllocationStrategy {

    ParkingSlot allocateSlot(ParkingLot parkingLot, Vehicle vehicle);

}
