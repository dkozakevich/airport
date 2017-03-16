
public class Runner {
    public static void main(String[] args) {
        String firstName = "Dmitry";
        String lastName = "Kozakevich";
        double baggageWeight = 20;

        Passenger passenger = new Passenger(firstName, lastName, baggageWeight);
        CheckIn checkIn = new CheckIn();

        if (checkIn.isBaggageOverweight(passenger) == false)
        System.out.println("Baggage is not overweight!!!");

        CashWindow cashWindow = new CashWindow();

        Ticket ticket = cashWindow.buyTicket(passenger, FlightClass.FIRST);
        ticket.showTicketInfo();


    }
}
