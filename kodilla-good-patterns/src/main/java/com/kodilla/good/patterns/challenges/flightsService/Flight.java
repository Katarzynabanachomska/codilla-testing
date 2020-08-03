package com.kodilla.good.patterns.challenges.flightsService;

public class Flight {

    private String departureCity;
    private String throughCity;
    private String arrivalCity;


    public Flight(String departureCity, String throughCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.throughCity = throughCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getThroughCity() {
        return throughCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        if (!arrivalCity.equals(flight.arrivalCity)) return false;
        return throughCity.equals(flight.throughCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        result = 31 * result + throughCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", throughCity='" + throughCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}
