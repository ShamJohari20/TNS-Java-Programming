package Day23_10Jan24;

//Write A Java Program using Lambda Expression to find the sum of two integer


public class SumHWDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumHW s = (a,b)->{
			int sum = a+b;
			System.out.println("Sum is = "+ sum);
		};
		s.Sum(10,20 );
		
	}

}
