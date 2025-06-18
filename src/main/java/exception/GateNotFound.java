package exception;

public class GateNotFound extends RuntimeException {

    public GateNotFound() {
        super();
    }

    public GateNotFound(String message) {
        super(message);
    }
}
