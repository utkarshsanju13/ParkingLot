package exception;

public class TicketNotFoundException extends RuntimeException{
    public TicketNotFoundException() {
        super();
    }
    public TicketNotFoundException(String message) {
        super(message);
    }
}
