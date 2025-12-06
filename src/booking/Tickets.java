package booking;

import java.util.ArrayList;
import java.util.List;

public class Tickets {
    private List<Ticket> tickets = new ArrayList<>();

    public List<Ticket> getTickets() {
        return tickets;
    }

    public Ticket makeTicket(Passenger passenger, Connection connection) {
        Ticket ticket = new Ticket(passenger, connection);
        return ticket;
    }
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
