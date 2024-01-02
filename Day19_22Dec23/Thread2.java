package Day19_22Dec23;

public class Thread2  implements Runnable{
	@Override
	public void run() {
		
		for(int i=11;i<20;i++) {
			System.out.println(i);
		}
	}

}