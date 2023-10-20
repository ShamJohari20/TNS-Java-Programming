package Day5;

public class Person {
	
	private String name;
	
	public Person() {
		
	}
	
	public Person (String name) {
		super ();
		this.name = name;
	}
	public String getname() {
		return name;
	}

	public void setname(String name) {
		name = name;
	}

	@Override
	public String toString() {
		return "Person [Name=" + name + "]";
	}
    
	
}
