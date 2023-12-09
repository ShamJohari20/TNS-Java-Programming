package Day11_31oct;

public class ArrayOperation {

	public static int getsum(int ... n) {
		int sum1=0;
		for(int k :n) {
			
			sum1 +=  k;
		}
		return sum1;
	}
	public static void printarry(int[] n)
	{
		  for (int k :n) {
			  System.out.println(k);
		  }
	}

}



