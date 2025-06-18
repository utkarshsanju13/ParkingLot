package service.Strategy.BillCalculationStrategy;

import exception.BillCalculationStrategyNotFoundException;
import model.enums.BillCalculationType;

public class BIllCalculationFactory {

    public static BillCalculationStrategy getBillCalculationStrategy(BillCalculationType type) {
        switch (type) {
            case SIMPLE_BILL_CALCULATION :
                return new SimpleBillCalulationStrategy();
              default :
                  throw new BillCalculationStrategyNotFoundException("the bill calculation strategy is not valid");
        }
    }
}
