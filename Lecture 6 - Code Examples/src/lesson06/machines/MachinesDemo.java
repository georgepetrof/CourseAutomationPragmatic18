package lesson06.machines;

public class MachinesDemo {
	
	public static void main(String[] args) {
		
		Machine printer1 = new Printer();
		((Printer)printer1).print();
		printer1.turnOn();
		
		Machine tractor = new Tractor();
		tractor.turnOn();
	}

}
