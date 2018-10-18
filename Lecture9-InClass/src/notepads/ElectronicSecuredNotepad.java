package notepads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import architecture.ElectronicDevice;
import architecture.Notepad;
import exceptions.ReplaceFailedException;
import utils.Page;

public class ElectronicSecuredNotepad extends SecuredNotepad implements ElectronicDevice, Notepad {
	private String password;

	public ElectronicSecuredNotepad(String password) {
		super(password);
	}

	@Override
	public void start() {
		isStarted();
		System.out.println("Electronic Secured Notepad is started");

	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isStarted() {
		return true;
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		if (isStarted()) {
			super.setPassword(password);
		} else {
			System.out.println("The device in not started");
		}
	}

	@Override
	public void createPage(String title, String text) {
		if (isStarted() && checkPassword()) {
			super.createPage(title, text);
		} else {
			System.out.println("The device in not started");
		}

	}

	@Override
	public void replaceText(int pageNumber, String text) throws ReplaceFailedException {
		if (isStarted() && checkPassword()) {
			super.replaceText(pageNumber, text);
		} else {
			System.out.println("The device in not started");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isStarted() && checkPassword()) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("The device in not started");
		}
	}

	@Override
	public void printAllPages() {
		if (isStarted() && checkPassword()) {
			super.printAllPages();
		} else {
			System.out.println("The device in not started");
		}
	}

	private boolean checkPassword() {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Dai parola be: ");
			String enteredPassword = scan.nextLine();

			if (enteredPassword.equals(this.password)) {
				System.out.println("Success!");
				return true;
			} else {
				System.out.println("Wrong password! Try again!");
			}
		}

		return false;
	}

}
