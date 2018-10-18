package example.inclass2;

public class Boss implements Dispatcher {

	@Override
	public void sendToWork(Employee employee) {
		employee.goToWork();
	}
	

	
}
