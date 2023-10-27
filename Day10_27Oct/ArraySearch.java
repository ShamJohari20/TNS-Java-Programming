package Day10_27Oct;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of Array  ");
		int n = sc.nextInt();
		int array [] = new int [n];
		
        System.out.println("Enter The Elements in the Array:");
        
        for (int i=0; i<n;i++) {
        	array[i]=sc.nextInt();
        }
        
        Arrays.sort(array);
        System.out.println("Enter The Elements which have to Search :");
        int s = sc.nextInt();
        
        int r =Arrays.binarySearch(array,s);
        
        if (r>=0) {
        	System.out.println("The Element is fouunt at index no :" + r );
        }
        else {
            System.out.println("Item not found in the array.");
        }
        
        
	}      

}
