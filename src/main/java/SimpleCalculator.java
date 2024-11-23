package main.java;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Choose an operation (+, -, *, /, ^, %): ");
        char operator = scanner.next().charAt(0);

        try {
            double result = calculator.calculate(number1, number2, operator);
            System.out.println("The result is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
