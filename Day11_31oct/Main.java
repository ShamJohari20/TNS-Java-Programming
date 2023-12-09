package Day11_31oct;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] stu;
		stu = new Student[5];
		
//		Student[] students = new Student[5];
		
		stu[0] = new Student ("Sham",47);
		stu[1] = new Student ("Sham",47);
		stu[2] = new Student ("Sham",47);
		stu[3] = new Student ("Sham",47);
		stu[4] = new Student ("Sham",47);
		
		
		  for (int i = 0 ;i<stu.length; i++) {
			  System.out.println(i + stu[i].getRoll_no() + stu[i].getRoll_no());
		  }
	}

}
