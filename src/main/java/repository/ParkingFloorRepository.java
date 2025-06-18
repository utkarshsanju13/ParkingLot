package repository;

import exception.ParkingFloorNotFound;
import exception.ParkingLotNotFound;
import model.ParkingFloor;
import model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int id) {
        ParkingFloor parkingFloor = this.parkingFloorMap.get(id);
        if(parkingFloor == null) {
            throw new ParkingFloorNotFound("No parking floor found with the given ID");
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor) {
        this.parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
    }
}
