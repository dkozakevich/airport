
public class Passenger {
    private String firstName;
    private String lastName;
    private double baggageWeight;

    public Passenger(String firstName, String lastName, double baggageWeight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.baggageWeight = baggageWeight;
    }


    public double getBaggageWeight() {
        return baggageWeight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
