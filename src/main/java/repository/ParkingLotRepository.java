package repository;

import exception.ParkingLotNotFound;
import model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    private Map<Integer, ParkingLot> parkingLots;
    int parkingLotCounter = 0;

    public ParkingLotRepository() {
        this.parkingLots = new HashMap<>();
    }

    public ParkingLot get(int id) {
        ParkingLot parkingLot = this.parkingLots.get(id);
        if(parkingLot == null) {
            throw new ParkingLotNotFound("No parking lot found with the given ID");
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot) {
        parkingLot.setId(++parkingLotCounter);
        this.parkingLots.put(parkingLot.getId(), parkingLot);
    }
}
