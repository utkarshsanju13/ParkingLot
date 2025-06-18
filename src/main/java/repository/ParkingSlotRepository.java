package repository;

import exception.ParkingSlotNotFound;
import model.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {

    private Map<Integer, ParkingSlot> parkingSlotsMap;

    public ParkingSlotRepository() {
        this.parkingSlotsMap = new HashMap<Integer, ParkingSlot>();
    }

    public ParkingSlot get(int id) {
        ParkingSlot parkingSlot = this.parkingSlotsMap.get(id);
        if(parkingSlot == null) {
            throw new ParkingSlotNotFound("Parking Slot not found...");
        }

        return parkingSlot;
    }

    public void put(ParkingSlot parkingSlot) {
        this.parkingSlotsMap.put(parkingSlot.getId(), parkingSlot);
    }
}
