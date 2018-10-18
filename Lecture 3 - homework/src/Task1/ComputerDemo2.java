package Task1;

public class ComputerDemo2 {

	public static void main(String[] args) {
	
	Computer Lenovo;
	Lenovo = new Computer(2010, 1500.50, true, 500, "Fedora");
	
	Computer Athlon;
	Athlon = new Computer(2015, 450.50, false, 250, "iOS");
	
	Computer Dell;
	Dell = new Computer(2017, 45.00, true, 1000, "Win 10");
	
	Computer Asus;
	Asus = new Computer(2015, 1800, false, 450, "Win7");
	
	Computer Mac;
	Mac = new Computer(2011, 45.00, true, 880, "iOS 12.11");
	
	
	Asus.comparePrice(Athlon);
	Lenovo.comparePrice(Asus);
	Dell.comparePrice(Lenovo);
	Mac.comparePrice(Dell);
	
	
	
	}
	
	
	

}
