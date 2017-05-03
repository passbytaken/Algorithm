package me.ele.napos.lambda;


/**
 * Created by jakoo on 02/05/2017.
 *
 */
public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (int a, int b) -> {return a * b;};

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + lambdaTest.operation(10, 5, addition));
        System.out.println("10 - 5 = " + lambdaTest.operation(10, 5, subtraction));
        System.out.println("10 * 5 = " + lambdaTest.operation(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambdaTest.operation(10, 5, division));

        GreetingService greetingService = message -> System.out.println("Hello " + message);

        greetingService.sayMessage("Eleme");
        greetingService.sayMessage("Google");


    }


     private interface MathOperation {
        int operation(int a, int b);
    }
     private interface GreetingService {
        void sayMessage(String message);
    }
    private int operation(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
