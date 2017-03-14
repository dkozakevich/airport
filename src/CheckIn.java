/**
 * Created by Dmitry on 14.03.2017.
 */
public class CheckIn {
    private double baggageWeightLimit = 20;

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
