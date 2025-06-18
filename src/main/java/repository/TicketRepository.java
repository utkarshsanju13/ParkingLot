package repository;

import exception.TicketNotFoundException;
import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Integer, Ticket> tickets;
    private static int ticketCounter = 0;

    public TicketRepository() {
        this.tickets = new HashMap<Integer, Ticket>();
    }

    public Ticket getTicket(int id) {
        Ticket ticket = this.tickets.get(id);
        if (ticket == null) {
            throw new TicketNotFoundException("No ticket found by given id : "+ id);
        }
        return ticket;
    }

    public void put(Ticket ticket) {
        ticket.setId(++ticketCounter);
        this.tickets.put(ticket.getId(), ticket);
    }


}
