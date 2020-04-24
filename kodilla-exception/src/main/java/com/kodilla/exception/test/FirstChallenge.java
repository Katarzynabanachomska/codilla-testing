package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0);
        if(a == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public double multiplication (double x, double y) throws ArithmeticException {
        if (x == 0);
        if (y == 0) {
            throw new ArithmeticException();
        }
        return x*y;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(0.0, 0);
            System.out.println(result);
        } catch (ArithmeticException n) {
            System.out.println("Nie możemy dzielic przez 0");

        } finally {
            System.out.println("Koniec programu");
        }
        try{
            double result = firstChallenge.multiplication(0.0,0.0);
            System.out.println(result);
        } catch (ArithmeticException z) {
            System.out.println("Nie mnożymy przez 0");
        } finally {
            System.out.println("end");
        }
    }
}
