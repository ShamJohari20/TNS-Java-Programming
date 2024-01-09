package Day21_5Jan24;

public class GenericInterfaceClass <T> implements GenericInterface <T> {
	
	T data;
	
	public void setdata(T val) {
		this.data = val;
		
	}
	
	public T getdata() {
		return data;
	}

}
