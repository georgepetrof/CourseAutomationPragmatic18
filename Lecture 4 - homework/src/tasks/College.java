package tasks;

public class College {

	public static void main(String[] args) {
		Student maria = new Student("Maria", "Informatics", 21);
		Student peter = new Student("Peter", "Mathematics", 19);
		Student georgi = new Student("Georgi", "Informatics", 18);

		System.out.println("Maria year in college: " + maria.yearlnCollege);

		for (int i = 0; i < 5; i++) {
			maria.upYear();
		}

		System.out.println("Maria year in college: " + maria.yearlnCollege);

		System.out.println("Maria money: " + maria.money);
		maria.receiveScholarship(3, 200);
		System.out.println("Maria money: " + maria.money);

		StudentGroup informatics = new StudentGroup("Informatics");
		informatics.addStudent(maria);
		informatics.addStudent(peter);
		informatics.addStudent(georgi);

		String bestStudent = informatics.theBestStudent();
		System.out.println("The best student is " + bestStudent);
		informatics.printStudentsInGroup();
	}

}
