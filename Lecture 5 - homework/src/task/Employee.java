package task;

public class Employee extends Person {

	private double daySalary;

	private static final int AGE = 18;
	private static final double OVERTIME = 1.5;

	public Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		this.daySalary = daySalary;
	}

	public double calculateOvertime(double hours) {
		if (getAge() < AGE) {
			return 0;
		} else {
			return hours * daySalary / 8 * OVERTIME;
		}
	}

	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Employee's day salary is: " + daySalary);
	}
}
