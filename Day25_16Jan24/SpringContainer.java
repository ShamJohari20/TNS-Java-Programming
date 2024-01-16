package Day25_16Jan24;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 var con = new  AnnotationConfigApplicationContext(SpringConfiguration1.class);
		 //will create container of spring for calling or managing beans 
		 // beans are nothing but functions created in configuration class
         String name = con.getBean("getName").toString();
         System.out.println("Name " + name +" age "+ con.getBean("getAge"));
         System.out.println(con.getBean("getPerson"));
         
         System.out.println(con.getBeanDefinitionCount());
         Arrays.stream(con.getBeanDefinitionNames()).forEach(System.out::println);
	}
}