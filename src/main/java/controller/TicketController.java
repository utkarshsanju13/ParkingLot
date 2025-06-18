package controller;

import model.Ticket;
import model.Vehicle;
import service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId) {
        return ticketService.generateTicket(vehicle,gateId,parkingLotId);
    }

    public Ticket getTicketById(int ticketId) {
        return  ticketService.getTicketById(ticketId);
    }
}
