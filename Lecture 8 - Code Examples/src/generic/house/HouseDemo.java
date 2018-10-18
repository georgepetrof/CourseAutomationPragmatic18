package generic.house;

import java.util.ArrayList;
import java.util.List;

public class HouseDemo {
	public static void main(String[] args) {
		House<Dog> myHouse = new House<>();
		House<Bird> myBirdHouse = new House<>();
//		House<Person> personHouse = new House<>();
		
		Dog sharo = new Dog();
		Person ivan = new Person();
		Ship titanic = new Ship();
		Bird tweety = new Bird();
		
//		personHouse.setResident(ivan);
		myHouse.setResident(sharo);
		
		myHouse.showType(sharo);
		myHouse.showType(ivan);
		myHouse.showType(tweety);

		
//		Person obitatel = personHouse.getResident();
	}

}
