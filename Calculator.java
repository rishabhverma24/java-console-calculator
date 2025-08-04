import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                running = false;
                System.out.println("Exiting calculator. Goodbye!");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    subtract(num1, num2);
                    break;
                case 3:
                    multiply(num1, num2);
                    break;
                case 4:
                    divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("--------------------------");
        }
        scanner.close();
    }

    // Method for addition
    public static void add(double x, double y) {
        System.out.println("Result: " + (x + y));
    }

    // Method for subtraction
    public static void subtract(double x, double y) {
        System.out.println("Result: " + (x - y));
    }

    // Method for multiplication
    public static void multiply(double x, double y) {
        System.out.println("Result: " + (x * y));
    }

    // Method for division with divide-by-zero handling
    public static void divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Result: " + (x / y));
        }
    }
}