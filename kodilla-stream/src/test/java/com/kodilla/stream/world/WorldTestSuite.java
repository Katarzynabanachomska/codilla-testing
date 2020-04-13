package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Country belarus = new Country("Belarus", new BigDecimal("15000000"));
        Country croatia = new Country("Croatia", new BigDecimal("20000000"));
        Country chile = new Country("Chile", new BigDecimal("30000000"));
        Country ecuador = new Country("Ecuador", new BigDecimal("35000000"));
        Country india = new Country("India", new BigDecimal("40000000"));
        Country israel = new Country("Israel", new BigDecimal("45000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(belarus);
        europe.addCountry(croatia);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(chile);
        southAmerica.addCountry(ecuador);

        Continent asia = new Continent("Asia");
        asia.addCountry(india);
        asia.addCountry(israel);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(southAmerica);
        world.addContinent(asia);
        
        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("185000000");
        Assert.assertEquals(expectedValue,worldPopulation);
    }
}
