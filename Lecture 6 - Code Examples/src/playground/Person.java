package playground;

public class Person implements Sporter, BuyFlowers {

	@Override
	public void run() {
		System.out.println("I'm running");
	}

	@Override
	public void jump() {
		System.out.println("I'm jumping");
	}

	@Override
	public void walk() {
		System.out.println("I'm walking");
	}

	@Override
	public void buyFlowers(int howMany) {
		System.out.println("I'm buying " + howMany + " flowers");
	}
	
	private void doSomething() {
		
	}
	
	public void fixCar() {
		System.out.println("I'm fixing a car");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
