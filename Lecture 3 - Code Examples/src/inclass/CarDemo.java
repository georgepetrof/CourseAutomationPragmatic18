package inclass;

public class CarDemo {

	public static void main(String[] args) {
		Car lada = new Car();
		lada.color = "white";

		Person ivan = new Person();
		ivan.name = "Ivan Georgiev";
		
		Person maria = new Person();
		maria.name = "Maria Ignatova";
		
		maria.friend = ivan;
		ivan.friend = maria;
		
		
		
		lada.owner = ivan;
		
		
		System.out.println(lada.owner);
		
		System.out.println(lada.gear);
		
		Car bmw = new Car();
		System.out.println(bmw.gear);
		
		lada.chageGearUp();
		lada.chageGearUp();
		lada.chageGearUp();
		lada.chageGearUp();
		lada.chageGearUp();

		lada.changeGearDown();
		lada.changeGearDown();
		lada.changeGearDown();
		lada.changeGearDown();
		lada.changeGearDown();
		lada.changeGearDown();
		
		lada.changeGear(0);
		
		lada.changeColor("green");
		
		System.out.println(lada.color);
		
		lada.changeColor("black");
		

	}

}
