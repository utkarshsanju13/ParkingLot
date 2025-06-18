package controller;

import model.Bill;
import model.Ticket;
import service.BillService;

public class BillController {

    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public Bill generateBill(Ticket ticket, int parkingLotId){
        return billService.generateBill(ticket, parkingLotId);
    }
}
