package lesson06.example;

public class Dog implements BowlingPlayer, StickBringer {

	@Override
	public void playBowling() {
		System.out.println("Nenormalna rabota, kato kuche igrae");
	}

	@Override
	public void drinkBeer() {
		System.out.println("mnogo obicha bira tva moe kuche");
	}

	@Override
	public void bringStick() {
		System.out.println("Byrzam da donesa prychkata shotto sam kuche");
	}

	

}
