package lesson06.animal;

public class Cat extends Animal{
	
	public void climb() {
		System.out.println("Climbing...");
	}
	
	public void makeSomeNoise() {
		System.out.println("Myal Myal...");
	}

	@Override
	public void play() {
		System.out.println("Playing like a cat...");
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a cat...");
	}

}
