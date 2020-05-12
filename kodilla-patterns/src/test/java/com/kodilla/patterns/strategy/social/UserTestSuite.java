package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User leokadia = new ZGeneration("Leokadia");
        User pudencjanna = new YGeneration("Pudencjanna");
        User halina = new Millenials("Halina");

        //When
        String result1 = leokadia.sharePost();
        System.out.println("I'm Leokadia and " + result1);
        String result2 = pudencjanna.sharePost();
        System.out.println("I'm Pudencjanna and " + result2);
        String result3 = halina.sharePost();
        System.out.println("I'm Halina and " + result3);

        //Then
        Assert.assertEquals("I'm using Snapchat.", result1);
        Assert.assertEquals("I'm using Twitter.", result2);
        Assert.assertEquals("I'm using Facebook.", result3);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User leokadia = new ZGeneration("");
        User pudencjanna = new YGeneration("");
        User halina = new Millenials("");

        //When
        leokadia.setSharingMedia(new TwitterPublisher());
        pudencjanna.setSharingMedia(new FacebookPublisher());
        halina.setSharingMedia(new SnapchatPublisher());
        String result4 = leokadia.sharePost();
        System.out.println("Hi! " + result4);
        String result5= pudencjanna.sharePost();
        System.out.println("Hi! " + result5);
        String result6 = halina.sharePost();
        System.out.println("Hi! " + result6);

        //Then
        Assert.assertEquals("I'm using Twitter.", result4);
        Assert.assertEquals("I'm using Facebook.", result5);
        Assert.assertEquals("I'm using Snapchat.", result6);
    }
}
