package Day20_3Jan24;

public class GenericClassTest {
	
	public static void main (String arr[]) {
	
	GenericClass<String> stringObj=new GenericClass<String>();
	stringObj.set("Hello");
	System.out.println(stringObj.get());

	//GenericClass with Integer type of data member
	GenericClass<Integer> integerObj=new GenericClass<Integer>();
	integerObj.set(10);
	System.out.println(integerObj.get());
}
}