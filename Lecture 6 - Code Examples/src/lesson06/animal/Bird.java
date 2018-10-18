package lesson06.animal;

public class Bird extends Animal{
	double flyingSpeed;
	
	void fly() {
		System.out.println("Flying...");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("Piu piu");
	}

	@Override
	public void play() {
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a bird");
	}
	
	public void sing() {
		System.out.println("Singing...");		
	}
	
	public void sing(String somethingToSing) {
		System.out.println("Singing the song" + somethingToSing);
	}
	
	public void sing(int singingWithIntNumber) {
		System.out.println("I'm singing with this Int number:" + singingWithIntNumber);
	}
		
	
}
