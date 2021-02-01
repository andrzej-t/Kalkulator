package com.example.demo;

public class Calculator {
    int a;
    int b;

    public int addNumbers(int a, int b) {
        System.out.println("Number \"a\" is: " + a + " and number \"b\" is: " + b);
        return a+b;
    }

    public int subtractNumbers(int a, int b) {
        System.out.println("Number \"a\" is: " + a + " and number \"b\" is: " + b);
        return a-b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(" ");
        System.out.println("Result of adding is: " + calculator.addNumbers(2, 3));
        System.out.println(" ");
        System.out.println("Result of subtracting is: " + calculator.subtractNumbers(10, 3));

    }
}
