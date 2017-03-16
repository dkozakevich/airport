
public class CashWindow {
    private String flightClass;

    public void bookTicket(){

    }

    public Ticket buyTicket(Passenger passenger, FlightClass flightClass){
        this.flightClass = FlightClass.FIRST.name();
        Ticket ticket = new Ticket(passenger, this.flightClass, TicketStatus.PURCHASED );
        return ticket;

    }

    public void returnTicket(Ticket ticket){

    }


}
