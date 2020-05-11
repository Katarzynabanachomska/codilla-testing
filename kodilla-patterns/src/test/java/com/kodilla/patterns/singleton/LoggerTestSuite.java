package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("The first logging.");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("The first logging.", result);
    }

}
