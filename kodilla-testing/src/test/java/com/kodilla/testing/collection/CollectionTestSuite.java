package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before (){
        System.out.println("Test Case: start");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbers, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(2);
        number1.add(4);
        number1.add(6);
        number1.add(8);
        //Then
       Assert.assertEquals(number1, result);
    }
}