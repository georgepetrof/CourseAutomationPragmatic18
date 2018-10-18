package lesson06.example;

public class Demo {
	public static void main(String[] args) {
		Dog sharo = new Dog();
		
		StickBringer marko = new Donkey();
		StickBringer vihar = new Dog();
		BowlingPlayer balkan = new Dog();
		
		BowlingPlayer ivan = new Person();
		
		bringMeTheStick(marko);
		bringMeTheStick(vihar);

	}
	
	static void bringMeTheStick(StickBringer stickBringer) {
		stickBringer.bringStick();
	}
	
	

}
