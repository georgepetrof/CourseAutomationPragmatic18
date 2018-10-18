package task;

public class Demo {

	public static final int ARRAY_LENGHT = 10;

	public static void main(String[] args) {

		Person[] people = new Person[ARRAY_LENGHT];

		Person nikoleta = new Person("Nikolea", 38, false);
		Person ognian = new Person("Ogniyan", 45, true);
		Student adi = new Student("Adi", 28, false, 5.55);
		Student joro = new Student("Joro", 34, true, 4.60);
		Employee neli = new Employee("Neli", 55, false, 45);
		Employee sasho = new Employee("Sasho", 39, true, 65);

		people[0] = nikoleta;
		people[1] = ognian;
		people[2] = adi;
		people[3] = joro;
		people[4] = neli;
		people[5] = sasho;

		for (Person p : people) {

			if (p != null) {
				System.out.println("");
				if (p instanceof Student) {
					((Student) p).showStudentInfo();
					continue;
				}
				if (p instanceof Employee) {
					((Employee) p).showEmployeeInfo();
					continue;
				}
				if (p instanceof Person) {
					p.showPersonInfo();

				}
			}

		}

		System.out.println("------------overtime------------");

		for (Person pe : people) {
			if (pe != null && pe instanceof Employee) {
				double overtime = ((Employee) pe).calculateOvertime(2);
				System.out.println(pe.getName() + "'s overtime is: " + overtime + "\n");
			}
		}

	}

}
