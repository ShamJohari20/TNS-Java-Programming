package Day9_26oct;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create using literals 
		String s1 = "SHAM";
		String s2 = "SHAM";
		
		// creating using new operator 
		
		String s3 = new String ("Sham");
		String s4 = new String ("Sham");
		
		// compare b/w == & equals 
		System.out.println("s1 == s2 : " + (s1==s2)+ "\t s1 Equales s2 " + s1.equals(s2));
		System.out.println("s1 == s3 : " + (s1==s3)+ "\t s1 Equales s3 " + s1.equals(s3));
		System.out.println("s4 == s3 : " + (s4==s3)+ "\t s4 Equales s3 " + s4.equals(s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		//compare to 
		System.out.println(s1.compareTo("Sham"));
		System.out.println(s1.compareToIgnoreCase("Sham"));
		System.out.println(s1.compareTo(s2));

		



	}

}
