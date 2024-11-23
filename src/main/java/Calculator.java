package main.java;

public class Calculator {
    public double calculate(double number1, double number2, char operator) {;
        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '^':
                return Math.pow(number1, number2);
            case '%':
                if (number2==0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                return number1 % number2;
            case '/':
                if (number2 != 0)
                    result = number1 / number2;
                else {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
        return result;
    }
}

