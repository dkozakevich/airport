
public class CashWindow {
    private String flightClass;
    private String flightDestination;

    public void bookTicket() {

    }

    public Ticket buyTicket(Passenger passenger, FlightClass flightClass, String flightDestination, Aircraft aircraft) {
        Ticket ticket = null;
        if (!aircraft.isAircraftFull()) {
            this.flightDestination = flightDestination;
            this.flightClass = FlightClass.FIRST.name();
            ticket = new Ticket(passenger, this.flightClass, TicketStatus.PURCHASED, flightDestination);

        }
        return ticket;

    }


    public void returnTicket(Ticket ticket) {

    }


}
