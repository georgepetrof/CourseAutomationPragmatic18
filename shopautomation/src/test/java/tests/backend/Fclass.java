package tests.backend;

import com.github.javafaker.Faker;

public class Fclass {
	
	
		Faker faker = new Faker();
		String name = faker.name().username();
		String fname = faker.name().firstName();
		String lname = faker.name().lastName();
		String email= faker.internet().emailAddress();
		String pass = faker.internet().password();
		String confirmpass = pass;

		
	


}
