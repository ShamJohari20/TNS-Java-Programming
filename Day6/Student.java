package Day6;

public class Student {

	  private String name;
	  private int age;
	  private String address;

	  public Student() {
	    this.name = "unknown";
	    this.age = 0;
	    this.address = "not available";
	  }

	  public void setInfo(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }

	  public void setInfo(String name, int age, String address) {
	    this.name = name;
	    this.age = age;
	    this.address = address;
	  }

	  public String getName() {
	    return name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public String toString() {
	    return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	  }

	  public static void main(String[] args) {
	    Student[] students = new Student[10];
	    for (int i = 0; i < 10; i++) {
            students[i] = new Student();
            students[i].setInfo("Student" + (i + 1), i + 10, "Address" + (i + 1));
        }

        // Display information of all students
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " Information:");
            students[i].toString();
            System.out.println();
        }
	  }
	}