

public class Ticket {
    private double price;
    private String flightNumber;
    private String passengeFirstName;
    private String passengeLastName;

    private String flightDestination;
    private String flightClass;
    private String status;

    public Ticket(Passenger passenger, String flightClass, TicketStatus ticketStatus, String flightDestination){
        this.flightClass = flightClass;
        this.status = ticketStatus.name();
        this.passengeFirstName = passenger.getFirstName();
        this.passengeLastName = passenger.getLastName();
        this.flightDestination = flightDestination;
    }

    public void showTicketInfo(){
        System.out.println("Flight class: " + flightClass + "\n" + "Ticket status: "
                + status + "\n" + "Passenger name: " + passengeFirstName + " " + passengeLastName + "\n"
                + "Destination: " + flightDestination + "\n" + "Flight Number: " + getFlightNumber(flightDestination));
    }

    private String getFlightNumber(String flightDestination){
        String flightNumber = "";

        for (FlightNumbers fN :FlightNumbers.values()){
            if (fN.getCityName().equals(flightDestination)){
                flightNumber = fN.getFlightNumber();
            }
        }
        return flightNumber;
    }



}
