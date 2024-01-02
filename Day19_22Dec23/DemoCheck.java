package Day19_22Dec23;

public class DemoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//extending thread class    
		Thread1 t1 = new Thread1();
		    t1.start();
		    
		    
		//implementing thread interface    
		    Thread2 t2 = new Thread2();
		     Thread t = new Thread(t2);
		    t.start();
	}

}
