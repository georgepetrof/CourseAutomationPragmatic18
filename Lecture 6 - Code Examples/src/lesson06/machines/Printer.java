package lesson06.machines;

public class Printer extends Functions {

	@Override
	public void turnOn() {
		System.out.println("Turning ON our printer");
	}

	@Override
	public void turnOff() {
		System.out.println("Turnging OFF our printer");		
	}

	
	public void print(){
		System.out.println("Printing a page");
	}

	@Override
	public void activateWiFi() {
		
	}
}
