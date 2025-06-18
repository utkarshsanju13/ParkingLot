package service.Strategy.SlotAllocationStrategy;

import exception.ParkingSlotNotFound;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSlot;
import model.Vehicle;
import model.enums.ParkingSlotStatus;

public class LinerSlotAllocationStrategy implements SlotAllocationStrategy{

    @Override
    public ParkingSlot allocateSlot(ParkingLot parkingLot, Vehicle vehicle){
      for(ParkingFloor parkingFloor: parkingLot.getParkingFloorList()){

          for(ParkingSlot parkingSlot : parkingFloor.getParkingSlotsList()){

              if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE) &&
              vehicle.getVehicleType().equals(parkingSlot.getVehicleType())){
                  return parkingSlot;
              }
          }
      }
      throw new ParkingSlotNotFound("No parking slot is empty...");
    }
}
