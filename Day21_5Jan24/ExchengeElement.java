package Day21_5Jan24;


//Write a generic method to exchange the positions of two different elements in an array.

public class ExchengeElement {
	
	public <T> void exchange(T[] arr, int i, int j) { 
	    T temp = arr[i]; 
	    arr[i] = arr[j]; 
	    arr[j] = temp; 
	} 

}
