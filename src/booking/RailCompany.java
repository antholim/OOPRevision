package booking;

public class RailCompany {
    private Tickets tickets = new Tickets();
    public void makeBooking(Passenger passenger, Connection connection) {
        Ticket ticket = tickets.makeTicket(passenger, connection);
        tickets.addTicket(ticket);
    }
}
