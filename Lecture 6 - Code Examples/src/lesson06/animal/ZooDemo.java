package lesson06.animal;


public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);

		Cat maca = new Cat();
		Dog sharo = new Dog();
		Animal papagal = new Bird();
		
		zoo.addAnimal(maca);
		zoo.addAnimal(sharo);
		zoo.addAnimal(papagal);
		
		
		
		
		
		
		
		
		
		
		
		Animal[] allAnimals = zoo.getAnimals();
		
		for (int i = 0; i < allAnimals.length; i++) {
			if(allAnimals[i] != null) {
				allAnimals[i].walk();
				allAnimals[i].makeSomeNoise();
				if(allAnimals[i] instanceof Bird) {
					Bird birdRef = (Bird)allAnimals[i];
					birdRef.sing();
				}
			}
		}

	}
}
