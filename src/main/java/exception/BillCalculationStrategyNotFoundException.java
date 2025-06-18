package exception;

public class BillCalculationStrategyNotFoundException extends RuntimeException {
    public BillCalculationStrategyNotFoundException() {
        super();
    }
    public BillCalculationStrategyNotFoundException(String message) {
        super(message);
    }
}
