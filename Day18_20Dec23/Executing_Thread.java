package Day18_20Dec23;

public class Executing_Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Thred1 t1 = new Thred1();
		  t1.start();
		  
		  
		  
		  RunnableExample rex = new RunnableExample();
		    
		  Thread t = new Thread(rex);
		  t.start();
	}

}
