package Day19_22Dec23;

public class TestGoodMorning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodMorning t1 = new GoodMorning();
	    t1.start();
	    
	    WellCome t2 = new WellCome();
	    t2.start();
	    t1.stop();
	    t2.stop();

	}

}
