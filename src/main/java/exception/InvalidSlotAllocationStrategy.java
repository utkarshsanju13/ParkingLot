package exception;

public class InvalidSlotAllocationStrategy extends RuntimeException {
    public InvalidSlotAllocationStrategy() {
        super();
    }

    public InvalidSlotAllocationStrategy(String message) {
        super(message);
    }
}
