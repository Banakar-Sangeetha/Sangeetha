import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        try {
            double result = Calculator.calculate(a, b, op.toLowerCase());
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

class Calculator {
    static double calculate(double a, double b, String op) {
        switch (op) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Division by zero");
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
