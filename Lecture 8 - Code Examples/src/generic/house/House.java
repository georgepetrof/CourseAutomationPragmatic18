package generic.house;

public class House<T extends Animal> {
	private T resident;

	public T getResident() {
		return resident;
	}

	public void setResident(T resident) {
		this.resident = resident;
	}
	
	public <P> void showType(P objectToShowTypeOf) {
		System.out.println(objectToShowTypeOf.getClass().getName());
	}

}
