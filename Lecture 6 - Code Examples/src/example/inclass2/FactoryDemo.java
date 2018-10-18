package example.inclass2;

public class FactoryDemo {
	public static void main(String[] args) {
		Dispatcher shefche = new Boss();
		Employee bg = new Bulgarian();
		Employee gr = new Greek();
		German de = new German();
		

		shefche.sendToWork(bg);
		shefche.sendToWork(gr);

		shefche.sendToWork(de);

	}

}
