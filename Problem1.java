package Coding;
import java.util.Scanner;

class Calculator {
    double a, b;
    String op;

    Calculator(double a, double b, String op) {
        this.a = a;
        this.b = b;
        this.op = op.toLowerCase();
    }

    double compute() {
        switch (op) {
            case "+":
            case "add":
                return a + b;

            case "-":
            case "sub":
                return a - b;

            case "*":
            case "mul":
                return a * b;

            case "/":
            case "div":
                return a / b;

            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        double result = calc.compute();

        System.out.println("Result: " + result);

        sc.close();
    }
}
