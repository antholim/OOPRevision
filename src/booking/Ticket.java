package booking;

public class Ticket {
    private Passenger passenger;
    private Connection connection;

    public Ticket(Passenger passenger, Connection connection) {
        this.passenger = passenger;
        this.connection = connection;
    }
}
