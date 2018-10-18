package com.pragmatic.lesson5.inheritance.homework.office;

public class OfficeDemo {

	public static void main(String[] args) {
		Task t1 = new Task("Task 1", 15);
		Task t2 = new Task("Task 2", 4);
		Task t3 = new Task("Task 3", 6);
		Task t4 = new Task("Task 4", 1);
		Task t5 = new Task("Task 5", 32);
		Task t6 = new Task("Task 6", 40);
		Task t7 = new Task("Task 7", 18);
		Task t8 = new Task("Task 8", 2);
		Task t9 = new Task("Task 9", 3);
		Task t10 = new Task("Task 10", 2);
		Task t11 = new Task("Task 11", 6);
		Task t12 = new Task("Task 12", 1000);
		
		AllWork work = new AllWork();
		work.addTask(t1);
		work.addTask(t2);
		work.addTask(t3);
		work.addTask(t4);
		work.addTask(t5);
		work.addTask(t6);
		work.addTask(t7);
		work.addTask(t8);
		work.addTask(t9);
		work.addTask(t10);
		work.addTask(t11);
		work.addTask(t12);
		
		Employee[] employees = { new Employee("Ivan"), new Employee("Joro"), new Employee("Peter") };
		Employee.setAllwork(work);
		
		int day = 1;
		while (Employee.getAllwork().isAllWorkDone() == false) {
			System.out.println("Start working day " + day);
			for (int i = 0; i < employees.length; i++) {
				employees[i].startWorkingDay();
				employees[i].work();
			}
			day ++;
		}
		
	}

}
