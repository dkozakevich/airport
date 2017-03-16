import javax.sound.midi.Soundbank;

public class Ticket {
    private double price;
    private String flightNumber;
    private String passengeFirstName;
    private String passengeLastName;

    private String flightClass;
    private String status;

    public Ticket(Passenger passenger, String flightClass, TicketStatus ticketStatus){
        this.flightClass = flightClass;
        this.status = ticketStatus.name();
        this.passengeFirstName = passenger.getFirstName();
        this.passengeLastName = passenger.getLastName();

    }

    public void showTicketInfo(){
        System.out.println(flightClass + "\n" + status + "\n" + passengeFirstName + "\n" + passengeLastName);
    }



}
