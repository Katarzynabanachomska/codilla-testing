package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsDataTestSuite {
    private Statistics statisticsMock;

    @Before
    public void setUp(){
        statisticsMock = mock(Statistics.class);
        ArrayList<String> userNumbers100 = new ArrayList<>();
        for (int i = 0; i<100; i++){
            userNumbers100.add("Unknow User");
        }
        when(statisticsMock.usersNames()).thenReturn(userNumbers100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
    }
    @Test
    public void test0Posts1000Comments100Users(){
        //Given
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticsData.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100,statisticsData.getUsersNumber());
        Assert.assertEquals(0,statisticsData.getPostNumber());
        Assert.assertEquals(1000,statisticsData.getCommentsNumber());
        Assert.assertEquals(0,statisticsData.getCommentsAveragePerPost(),1e-8);
        Assert.assertEquals(10, statisticsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(0,statisticsData.getCommentsAveragePerPost(),1e-8);
    }
    @Test
    public void test1000Posts1000Comments0users(){
        //Given
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNumbers0);

        //When
        statisticsData.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,statisticsData.getUsersNumber());
        Assert.assertEquals(1000, statisticsData.getPostNumber());
        Assert.assertEquals(1000,statisticsData.getCommentsNumber());
        Assert.assertEquals(0,statisticsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0,statisticsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(1,statisticsData.getCommentsAveragePerPost(),1e-8);
    }
    @Test
    public void test1000Posts1000Comments100Users(){
        //Given
        StatisticsData statisticsData = new StatisticsData(statisticsMock);

        //When
        statisticsData.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100,statisticsData.getUsersNumber());
        Assert.assertEquals(1000, statisticsData.getPostNumber());
        Assert.assertEquals(1000,statisticsData.getCommentsNumber());
        Assert.assertEquals(10,statisticsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(10,statisticsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(1,statisticsData.getCommentsAveragePerPost(),1e-8);
    }
    @Test
    public void test1000Posts0Comments100Users() {
        //Given
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsData.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsData.getUsersNumber());
        Assert.assertEquals(1000, statisticsData.getPostNumber());
        Assert.assertEquals(0, statisticsData.getCommentsNumber());
        Assert.assertEquals(10, statisticsData.getPostsAveragePerUser(), 1e-8);
        Assert.assertEquals(0, statisticsData.getCommentsAveragePerUser(), 1e-8);
        Assert.assertEquals(0, statisticsData.getCommentsAveragePerPost(), 1e-8);
    }
    @Test
    public void moreCommentsThanPost(){
        //Given
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statisticsData.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsData.getUsersNumber());
        Assert.assertEquals(10, statisticsData.getPostNumber());
        Assert.assertEquals(100, statisticsData.getCommentsNumber());
        Assert.assertEquals(0.1, statisticsData.getPostsAveragePerUser(), 0.1);
        Assert.assertEquals(1, statisticsData.getCommentsAveragePerUser(), 1e-8);
        Assert.assertEquals(10, statisticsData.getCommentsAveragePerPost(), 1e-8);
    }
    @Test
    public void lessCommentsThanPost(){
        //Given
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        statisticsData.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsData.getUsersNumber());
        Assert.assertEquals(100, statisticsData.getPostNumber());
        Assert.assertEquals(10, statisticsData.getCommentsNumber());
        Assert.assertEquals(1, statisticsData.getPostsAveragePerUser(), 1e-8);
        Assert.assertEquals(0.1, statisticsData.getCommentsAveragePerUser(), 0.1);
        Assert.assertEquals(0.1, statisticsData.getCommentsAveragePerPost(), 1e-8);
    }
}
