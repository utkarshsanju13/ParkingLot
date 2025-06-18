package exception;

public class ParkingLotNotFound extends RuntimeException{

    public ParkingLotNotFound() {
        super();
    }

    public ParkingLotNotFound(String message) {
        super(message);
    }
}
