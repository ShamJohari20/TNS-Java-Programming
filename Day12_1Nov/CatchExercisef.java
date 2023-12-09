package Day12_1Nov;

public class CatchExercisef {

	public static void main (String arr[]) {
		
		try{
			
			int a[]=new int[5];    			
			a[5] =30/5; 
			
		}
		catch(ArithmeticException e ){
			System.out.println("ArithmeticException" + e);
			
		}
		catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("ArrayIndexOutOfBoundsException" +e);
			
		}
	}
}
