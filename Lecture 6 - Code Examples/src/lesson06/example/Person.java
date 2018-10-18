package lesson06.example;

public class Person implements BowlingPlayer {

	@Override
	public void playBowling() {
		System.out.println("Igraem bowling normalno");
	}

	@Override
	public void drinkBeer() {
		System.out.println("Piim qko dokato igraem");
	}
	
	public void walk(){
		System.out.println("hodq si");
	}

}
