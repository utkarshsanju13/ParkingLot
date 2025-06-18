package controller;

import model.ParkingLot;
import service.ParkingLotService;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot initializeParkingLot() {
        return parkingLotService.buildParkingLot();
    }


}
