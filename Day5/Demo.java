package Day5;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.setname("Sham");
		e1.setDepartment("CSE");
		System.out.println(e1.toString());
				
		
		Student s1 = new Student();
		s1.setScore("Dist");
		s1.setname("Sham");
		System.out.println(s1.toString());
		
		Person p;
		
		p = new Employee ("pp","HR");
		System.out.println(p.toString());
		
		boolean b = p instanceof Employee;
		System.out.println(b);
	}

}
