package exception;

public class ParkingFloorNotFound extends RuntimeException {

    public ParkingFloorNotFound() {

    }

    public ParkingFloorNotFound(String message) {
        super(message);
    }
}
