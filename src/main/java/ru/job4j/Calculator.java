package ru.job4j;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int f) {
        return f / x;
    }

    public int sumAllOperation(int sumRst, int multiplyRst, int minusRst, int divideRst) {
        return  sumRst + multiplyRst + minusRst + divideRst;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int subtraction = minus(7);
        System.out.println(subtraction);
        int divisionResult = calculator.divide(20);
        System.out.println(divisionResult);
        int operationSum = calculator.sumAllOperation(result, rsl, subtraction, divisionResult);
        System.out.println(operationSum);
    }

}
