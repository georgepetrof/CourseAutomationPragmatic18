package lesson06.machines;

public abstract class Functions implements Machine, MobileDevice {

	public void someGeneralFunction(){
		System.out.println("Executing general function");
	}
	
	@Override
	public abstract void turnOn();

	@Override
	public abstract void turnOff();

}
