package Day15;

import java.util.Scanner;

public class NoFormateException {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("The entered number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } 
    }

}
