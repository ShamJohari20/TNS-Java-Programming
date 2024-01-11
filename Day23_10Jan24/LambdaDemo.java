package Day23_10Jan24;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		zero parameter 
		ZeroParameter s0 = ()->{
			System.out.println("hello i am Zero parameter Lambda Function ");
		};
		s0.getName();
		
		
//		One Parameter
		OneParameter s1 = ()->{
			System.out.println("I Am Type one Parameter Lambda Function ");
		};
		s1.getName1();
		
		
//		Multiple Parameter
		calc c = (a,b) -> {
			System.out.println("I Am Type Multiple Parameter Lambda Function ");
			int m = a*b;
			System.out.println("Multiplication  is " + m);
		};
		c.getSum(20,20);	
		
//		Return Type
		
		ReturnType r =(a,b)->{
			System.out.println("I Am Return Type Lambda Function ");
			return a+b;
		};
		int s=r.Sum(10, 20);
		System.out.println("Sum  is " + s);

		

		}
	}