
public enum FlightNumbers {
    NEWYOURK("New York", "N1100"),
    LONDON("London", "L7534"),
    KIEV("Kiev", "K5598");

    private String cityName;
    private String flightNumber;

    private FlightNumbers(String cityName, String flightNumber) {
        this.cityName = cityName;
        this.flightNumber = flightNumber;
    }

    public String getCityName(){
        return cityName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
