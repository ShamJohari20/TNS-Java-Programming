package Day25_16Jan24;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age ,String city) {};

@Configuration
public class SpringConfiguration1 {
	
	@Bean
	public String getName() {
		return "Sham";
	}
	
	@Bean
	public int getAge() {
		return 22;
	}
	
	@Bean
	public Person getPerson() {
		var Person = new Person ("Sham",23,"Khamgaon" );
		return Person;
	}

}