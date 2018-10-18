package lesson06.animal;


public abstract  class Animal {
	private int age;
	private double weight;
	
	public void breathe() {
		System.out.println("Breating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public abstract void makeSomeNoise();
	public abstract void play();
	
}
