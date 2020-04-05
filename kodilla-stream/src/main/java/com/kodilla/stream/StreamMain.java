package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import jdk.nashorn.internal.objects.NativeString;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //MODULE 7.1 zadanie

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("7.1:",text -> "ABC " + text);
        poemBeautifier.beautify("7.1", NativeString::toUpperCase);
        poemBeautifier.beautify("7.1",StreamMain::myMethod);
        poemBeautifier.beautify("7.1",text -> {
            String c = text.concat(" done");
            c = c + "Ok";
            return c;
    });

    }
    public static String myMethod(String text) {
        String c = text.replace("d","5");
        c = c.replace("k","K");
        return c;
    }
}
