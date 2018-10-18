package example.inclass3;

public abstract class AbstractAnimal implements Animal{

	@Override
	public void breathe() {
		System.out.println("breathing");
	}

	@Override
	public void walk() {
		System.out.println("walking");
	}

	public abstract void makeSomeNoise();
	
}
