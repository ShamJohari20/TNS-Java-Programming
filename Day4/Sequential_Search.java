package Day4;

import java.util.Scanner; 

public class Sequential_Search {
	public static void main(String[] args) {
	
	int i, noe, item, array[];
	
		
	Scanner sc = new Scanner(System.in); //object of Scanner Class 
		
	System.out.println("Enter number of elements:");  
	noe = sc.nextInt();  //take user input

	array = new int[noe];  // declare the size of array 
		
	System.out.println("Enter " + noe + " integers"); //for entering array element from user 
	for (i = 0; i < noe; i++)
		array[i] = sc.nextInt(); //insert the element into array
	
	System.out.println("Enter the search value:");
	item = sc.nextInt(); //enter which  element you have to search
	
	for (i = 0; i < noe; i++) {
		if (array[i] == item) { // searching the element 1 by 1 its sequential search also linear search
	            	
		System.out.println(item + " is present at location " + (i)); // display the element if present 
	
		break; // if element found then break from the loop 
		}
		}
	if (i == noe) //checking if item not found in array  
		System.out.println(item + " doesn't exist in array."); 
	}
}

		



