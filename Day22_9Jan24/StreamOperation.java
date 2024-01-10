package Day22_9Jan24;
import java.util.*;
import java.util.stream.Stream;
public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> sno = Stream.of(20,30,40,50);
		
		Integer [] nos = {34,78,90,1}; /// array of integer
		
		List<Integer> nos1 = Arrays.asList(45,78,90,1,2,5);  // collection of numbers
		
	    sno = Arrays.stream(nos);
	    
//	    Stream<Integer> result =sno.map(k -> k*k );
	   
//		result.forEach(System.out::println);
	    
	    
	    sno.filter(num -> num  > 10).forEach(System.out::println); 

	}

}
