package Day19_22Dec23;

public class WellCome  extends Thread{
	@Override
	public void run() {
		
		  try {
	            Thread.sleep(400);
	    }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		while(true) {
			System.out.println("WellCome");
		}
		
	}

}