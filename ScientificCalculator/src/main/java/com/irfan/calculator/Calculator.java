package com.irfan.calculator;

import java.util.Scanner;

public class Calculator {
   
    public double squareRoot(double x) {
        if (x < 0) {
            System.out.println("Input is a negative Integer.Give only a positive integer");
            return -1;
        }
       # t
        return Math.sqrt(x);
    }

    
    public long factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Negative factorials can't be found . Give positive Integers");
            return -1;
        }
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public double naturalLog(double x) {
        if (x <= 0) {
            System.out.println("Logarithm of Negative number is undefined");
            return -1;
        }
        return Math.log(x);
    }

    
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln x)");
            System.out.println("4. Power (a^b)");
            System.out.println("5. Exit");
            System.out.print("Choose one of the Above: ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exit...");
                break;
            }

            double num, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = scanner.nextDouble();
                    result = calc.squareRoot(num);
                    if (result != -1) System.out.println("√" + num + " = " + result);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    long factResult = calc.factorial(n);
                    if (factResult != -1) System.out.println(n + "! = " + factResult);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    num = scanner.nextDouble();
                    result = calc.naturalLog(num);
                    if (result != -1) System.out.println("ln(" + num + ") = " + result);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    result = calc.power(base, exponent);
                    System.out.println(base + "^" + exponent + " = " + result);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
