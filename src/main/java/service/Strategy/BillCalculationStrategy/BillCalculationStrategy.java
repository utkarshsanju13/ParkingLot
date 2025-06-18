package service.Strategy.BillCalculationStrategy;

import model.Bill;
import model.Ticket;

public interface BillCalculationStrategy {

    int calculate(Ticket ticket);
}
