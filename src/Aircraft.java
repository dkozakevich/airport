
public class Aircraft {
    private int maxPassengersCapacity;
    private int currentNumberOfPassengers;
    private String flightNumber;

    public Aircraft(int maxPassengersCapacity, int currentNumberOfPassengers, String flightNumber){
        this.maxPassengersCapacity = maxPassengersCapacity;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.flightNumber = flightNumber;
    }

    public boolean isAircraftFull(){
        boolean isAircaftFull;
        if (currentNumberOfPassengers < maxPassengersCapacity) {
            isAircaftFull = false;
        }
        else isAircaftFull = true;
        return isAircaftFull;
    }

    public int getMaxPassengersCapacity() {
        return maxPassengersCapacity;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }
}
