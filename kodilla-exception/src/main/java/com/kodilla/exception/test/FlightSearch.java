package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void searchFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightConnections = new HashMap<>();
        flightConnections.put("Lawica", false);
        flightConnections.put("Beauvais", true);
        flightConnections.put("Keflavik", false);

        if (flightConnections.get(flight.getArrivalAirport()) != null) {
            if (flightConnections.get(flight.getArrivalAirport())) {
                System.out.println("Connection is to " + flight.getArrivalAirport());
            } else if (flightConnections.get(flight.getArrivalAirport())) {
                System.out.println("There is no connection to: " + flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException("There is no connection from this airport");
        }
    }
}
