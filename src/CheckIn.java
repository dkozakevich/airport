
public class CheckIn {
    private double baggageWeightLimit = 20;


    public void checkInThePassenger(Ticket ticket, Passenger passenger){

        if (!isBaggageOverweight(passenger)){
            ticket.setTicketStatus(TicketStatus.CHECKEDIN);
            System.out.println("Passenger is " + ticket.getTicketStatus());
        }
        else System.out.println("Passenger can't be checked in due to the baggage overweight\n"
                + "Ticket status is " + ticket.getTicketStatus());



    }

    public boolean isBaggageOverweight(Passenger passenger){
        // what if use the next "boolean isBaggageOverweight = true" and remove else statement
        boolean isBaggageOverweighted;

        if (passenger.getBaggageWeight() <= baggageWeightLimit) {
            isBaggageOverweighted = false;
        }
        else isBaggageOverweighted = true;

        return isBaggageOverweighted;
    }
}
