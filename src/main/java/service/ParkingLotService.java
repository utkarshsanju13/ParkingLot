package service;

import model.ParkingLot;

public class ParkingLotService {

    private InitService initService;

    public ParkingLotService(InitService initService) {
        this.initService = initService;
    }

    public ParkingLot buildParkingLot() {
        return  initService.init();
    }
}
