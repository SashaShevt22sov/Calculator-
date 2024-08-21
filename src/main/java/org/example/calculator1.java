package org.example;

public class calculator1 {
    public static double calculator(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.err.print("Error:На ноль делить нельзя.");
                    return Double.NaN;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.print("Error");
                return Double.NaN;

        }
    }
}
