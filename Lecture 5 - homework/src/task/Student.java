package task;

public class Student extends Person {

	private double score;

	Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.score = score;

	}
	public void showStudentInfo() {
		showPersonInfo();
		System.out.println("The student score is: " + score);
	}
}
