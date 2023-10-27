package Day9_26oct;

import java.util.Scanner;

public class CheakA {
	
	 public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();

	        int Count = 0;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
	                Count++;
	            }
	        }

	        System.out.println("The  'A'&'a' occurs " + Count + " times in the string.");
	    }
	}

