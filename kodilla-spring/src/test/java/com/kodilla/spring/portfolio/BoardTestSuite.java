package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> sampleToDoList = board.getToDoList().taskAdd("Kodilla 14.1");
        List<String> sampleInProgressList = board.getInProgressList().taskAdd("Kodilla 14.2");
        List<String> sampleDoneList = board.getDoneList().taskAdd("Kodilla 14.3");
        //Then
        Assert.assertEquals(sampleDoneList.get(0), "Kodilla 14.3");
        Assert.assertEquals(sampleInProgressList.get(0), "Kodilla 14.2");
        Assert.assertEquals(sampleToDoList.get(0), "Kodilla 14.1");
    }
}
