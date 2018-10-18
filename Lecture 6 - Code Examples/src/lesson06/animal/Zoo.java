package lesson06.animal;


public class Zoo implements IZoo {
	private Animal[] animals;
	
	public Zoo(int cages) {
		animals = new Animal[cages];
	}
	
	public void addAnimal(Animal animalToAdd) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animalToAdd;
				return;
			}
		}
	}
	
	
	public void walkAnimal(Animal animal) {
		animal.walk();
		//if animal is bird, sing...
		if(animal instanceof Bird) {
			((Bird)animal).sing();
		}
	}
	
	public void walkAnimals() {
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if(animal == null) {
				continue;
			}
			animal.walk();
			animal.makeSomeNoise();
		}
	}

	public Animal[] getAnimals() {
		return this.animals;
	}
}
