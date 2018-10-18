import java.util.ArrayList;
import java.util.List;

public class RawTypeCollectionExample {
	public static void main(String[] args) {
		List myList = new ArrayList();
		
		myList.add(new Dog());
		myList.add(new Ship());
		
		for (Object curObject : myList) {
			if(curObject instanceof Dog) {
				Dog myDog = (Dog) curObject;
				myDog.bringStick();
			}
			
			if(curObject instanceof Ship) {
				Ship myShip = (Ship) curObject;
				myShip.sail();
			}
		}
	}
}
