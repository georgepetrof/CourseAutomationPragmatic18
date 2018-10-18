package lesson06.animal;

public class Dog extends Animal{
	
	private boolean isDangerous;
	
	public void bringStick(){
		
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Bau Bau");
	}

	@Override
	public void play() {
		System.out.println("Playing with stick");
		bringStick();
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a dog");
	}
	
}
