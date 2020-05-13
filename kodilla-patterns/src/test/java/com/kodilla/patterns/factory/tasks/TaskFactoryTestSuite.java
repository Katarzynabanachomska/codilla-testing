package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTasks(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("foodShopping", shopping.getTaskName());
        Assert.assertEquals("Buying 2.0 apples.", shopping.executeTask());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTasks(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("housePainting", painting.getTaskName());
        Assert.assertEquals("Painting bedroom blue.", painting.executeTask());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTasks(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("cityDriving", driving.getTaskName());
        Assert.assertEquals("Driving a car to the supermarket.", driving.executeTask());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
