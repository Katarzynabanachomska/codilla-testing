package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args []){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyWillThrowException(3, 5);
        } catch (Exception a) {
            System.out.println("An exception will occur in this method: " + a);
        } finally {
            System.out.println("The code has been blocked");
        }
    }
}
