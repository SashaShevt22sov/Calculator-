package org.example;

import java.util.Scanner;

import static org.example.calculator1.calculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите оператора (+,-,*,/): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double result = calculator(num1, operator, num2);
            System.out.print("Результа =  " + result + " ");


            System.out.print("Вы хотите продолжить? Если да введите первое число, если нет то нажмите n: ");
            String count = scanner.next();
            if (count.equalsIgnoreCase("n")) {
                break;
            }
        }
        scanner.close();
    }

}