package Day11_31oct;

public class Student {

	String name ;
	int roll_no ;
	
	Student(String name , int rollno){
		this. name = name;
		this. roll_no = roll_no;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", getName()=" + getName() + ", getRoll_no()="
				+ getRoll_no() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
