package com.kodilla.good.patterns.challenges.flightsService;

import java.util.ArrayList;
import java.util.List;

public final class FlightsRepository {

    private final List<Flight> flights = new ArrayList<>();

    public FlightsRepository() {

        flights.add(new Flight("Kraków", "Wrocław", "Poznań"));
        flights.add(new Flight("Kraków", "Warszawa", "Gdańsk"));
        flights.add(new Flight("Kraków", "Wrocław", "Szczecin"));
        flights.add(new Flight("Gdańsk", "Warszawa", "Kraków"));
        flights.add(new Flight("Wrocław", "Warszawa", "Gdańsk"));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}
