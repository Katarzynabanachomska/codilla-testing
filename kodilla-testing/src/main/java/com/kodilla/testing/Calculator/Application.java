package com.kodilla.testing.Calculator;

    class Application {
        public static void main (String[]args) {
            Calculator calculator = new Calculator();
            int resultAdd = calculator.addAToB(6,8);
            int resultSubstract = calculator.substractAFromB(87,54);

            System.out.println("Result Add "+ resultAdd);
            System.out.println("Result Substract "+ resultSubstract);
        }
    }
