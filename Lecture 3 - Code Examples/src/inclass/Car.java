package inclass;

public class Car {
	double maxSpeed;
	double currentSpeed;
	String color;
	int gear = 1;
	Person owner;
	
	void accelerate() {
		currentSpeed += 10;
		//currentSpeed = currentSpeed + 10;
	}
	
	void chageGearUp() {
		if(gear < 5) {
			gear++;
			System.out.println("gear= " + gear);
		} else {
			System.out.println("Veche si na 5-ta be");
		}
	}
	
	void changeGearDown() {
		if(gear > 1) {
			gear--;
			System.out.println("gear= " + gear);
		} else {
			System.out.println("Veche si na 1-va be");
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear < 1 || nextGear > 5) {
			System.out.println("Samo mejdu 1 i 5 moi chovek");
		} else {
			gear = nextGear;
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
	}
}
 