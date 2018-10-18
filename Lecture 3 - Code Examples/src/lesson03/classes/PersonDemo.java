package lesson03.classes;

public class PersonDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		Person maria = new Person();
		Person ani = new Person();
		
		ivan.weight = 50;
		
		ivan.name = "Ivan Georgiev";
		maria.name = "Maria Ivanova";
		ivan.eat();
		maria.eat();
		ivan.eat();
		
		System.out.println(ivan.weight);
		
		ivan.drinkWater(1);
		ivan.drinkWater(0.7);
		
		
	}
}
