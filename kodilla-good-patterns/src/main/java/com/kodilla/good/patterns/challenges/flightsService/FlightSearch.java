package com.kodilla.good.patterns.challenges.flightsService;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    FlightsRepository flightsRepository = new FlightsRepository();


    public List<Flight> findFlightFrom(String city) {
        List<Flight> flightFrom = flightsRepository.getFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(city))
                .collect(Collectors.toList());
        System.out.println(flightFrom);
        return flightFrom;
    }


    public List<Flight> findFlightTo(String city) {
        List<Flight> flightTo = flightsRepository.getFlights().stream()
                .filter(flight -> flight.getArrivalCity().equals(city))
                .collect(Collectors.toList());
        System.out.println(flightTo);
        return flightTo;
    }

    public List<Flight> findFlightThrough(String departureCity, String city, String arrivalCity) {
        List<Flight> flightThrough = flightsRepository.getFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .filter(flight -> flight.getThroughCity().equals(city))
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
        System.out.println(flightThrough);
        return flightThrough;
    }
}
