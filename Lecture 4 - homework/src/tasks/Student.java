package tasks;

public class Student {

	String name;
	public String subject;
	double grade;
	int yearlnCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4.0;
		yearlnCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (isDegree) {
			System.out.println("The student is degree");
			return;
		}
		yearlnCollege++;
		if (yearlnCollege == 4) {
			isDegree = true;
		}
	}

	double receiveScholarship(double min, double amount) {
		if (grade > min && age < 30) {
			money += amount;
		}
		return money;
	}

}
