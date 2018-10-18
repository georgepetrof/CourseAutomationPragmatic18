package com.pragmatic.lesson5.inheritance.homework.office;


public class AllWork {
	private static final int MAX_NUMBER_OF_TASKS = 10; 
	
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	public AllWork() {
		tasks = new Task[MAX_NUMBER_OF_TASKS];
		freePlacesForTasks = MAX_NUMBER_OF_TASKS;
		currentUnassignedTask = 0;
	}
	
	public void addTask(Task task) {
		if(task == null) {
			return;
		}
		if(freePlacesForTasks == 0) {
			System.out.println("No place for new tasks!");
			return;
		}
		tasks[tasks.length - freePlacesForTasks] = task;
		freePlacesForTasks--;
		System.out.println("Added task: " + task.getName());
	}
	
	public Task getNextTask() {
		if(currentUnassignedTask >= tasks.length) {
			return null;
		}
		
		Task unassignedTask = tasks[currentUnassignedTask];
		currentUnassignedTask ++;
		return unassignedTask;
	}
	
	public boolean isAllWorkDone() {
//		for (int i = 0; i < tasks.length; i++) {
//			if(tasks[i] != null && tasks[i].getWorkingHours() != 0) {
//				return false;
//			}
//		}

	
		for (int i = 0; i < tasks.length - freePlacesForTasks; i++) {
			if(tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
