
public class Runner {
    public static void main(String[] args) {
        String firstName = "Dmitry";
        String lastName = "Kozakevich";
        double baggageWeight = 21;
        String flightDestination = "New York";

        Passenger passenger = new Passenger(firstName, lastName, baggageWeight);
        Aircraft aircraftAirbus = new Aircraft(20, 19, "N1100");

        CashWindow cashWindow = new CashWindow();


        Ticket ticket = cashWindow.buyTicket(passenger, FlightClass.FIRST, flightDestination, aircraftAirbus);

        ticket.showTicketInfo();


        CheckIn checkIn = new CheckIn();

        checkIn.checkInThePassenger(ticket, passenger);

        System.out.println("Check changed email");

    }
}
