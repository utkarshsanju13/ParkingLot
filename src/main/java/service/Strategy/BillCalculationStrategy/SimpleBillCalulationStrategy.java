package service.Strategy.BillCalculationStrategy;

import model.Bill;
import model.Gate;
import model.Ticket;
import model.enums.BillStatus;
import model.enums.GateStatus;
import model.enums.GateType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalulationStrategy implements BillCalculationStrategy {

    @Override
    public  int calculate(Ticket ticket) {
        // will calculate as 1sec -> 1rs
        LocalDateTime exitTime = LocalDateTime.now();
        //THis can also be used
//        Long timeDiff = Duration.between(ticket.getEntryTime(), exitTime).toSeconds();
        Long timeDiff = ChronoUnit.SECONDS.between(ticket.getEntryTime(), exitTime);
        return (int)(1 * timeDiff); //per sec Rs1
    }
}
