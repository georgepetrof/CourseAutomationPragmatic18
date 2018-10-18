package tasks;

import javax.security.auth.Subject;

import org.omg.Messaging.SyncScopeHelper;

public class StudentGroup {

	String groupSubject;
	int freePlaces;
	Student students[];

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (!s.subject.equals(this.groupSubject)) {
			System.out.println(s.name + " has different subject!");
			return;
		}
		if (freePlaces == 0) {
			System.out.println("Sorry, there is not free place");
			return;
		}

		students[students.length - freePlaces] = s;
		freePlaces--;
	}

	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	String theBestStudent() {
		Student bestStudent = students[0];
		for (int i = 1; i < students.length - freePlaces; i++) {
			if (students[i].grade > bestStudent.grade) {
				bestStudent = students[i];
			}
		}
		return bestStudent.name;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < students.length - freePlaces; i++) {
			System.out.println("Name:" + students[i].name + " age: " + students[i].age );
		}
	}

}
