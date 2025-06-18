package exception;

public class ParkingSlotNotFound  extends RuntimeException{

    public ParkingSlotNotFound() {
        super();
    }

    public ParkingSlotNotFound(String message) {
        super(message);
    }
}
