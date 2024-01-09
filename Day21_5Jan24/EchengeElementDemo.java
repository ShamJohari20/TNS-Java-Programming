package Day21_5Jan24;


//Write a generic method to exchange the positions of two different elements in an array.


import java.util.Arrays;
import java.util.Scanner;

public class EchengeElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();
	        
	        Integer[] arr = new Integer[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("Enter the index of element to exchang:");
	        int i = scanner.nextInt();
	        int j = scanner.nextInt();
	        
	        ExchengeElement s = new ExchengeElement();

	        s.exchange(arr, i, j);

	        System.out.println("Array after exchanging elements:");
	        System.out.println(Arrays.toString(arr));
	        
	      
	    }
	}
