package Day13_3Nov;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter valid integer values for both numerator and denominator.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
