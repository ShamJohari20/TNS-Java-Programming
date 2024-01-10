package Day22_9Jan24;

import java.util.*;
import java.util.stream.Stream;


public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream <Integer> s = Stream.of(10,20,30,40,50);
		s.forEach(System.out::println);
		
//		long s1 = s.count();
//		System.out.println(s1);
		
		Stream<Integer> result =s.map(k -> k*k );  
		result.forEach(System.out::println);
		
		
		
	}

}
