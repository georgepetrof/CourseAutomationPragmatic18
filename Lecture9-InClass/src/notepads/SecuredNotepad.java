package notepads;

import java.util.Scanner;

import exceptions.ReplaceFailedException;

public class SecuredNotepad extends SimpleNotepad {
	
	private String password;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SecuredNotepad(String password) {
		this.password = password;
	}

	private boolean checkPassword() {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Dai parola be: ");
			String enteredPassword = scan.nextLine();
			
			if(enteredPassword.equals(this.password)) {
				System.out.println("Success!");
				return true;
			} else {
				System.out.println("Wrong password! Try again!");
			}
		}
		
		return false;
	}
	
	@Override
	public void createPage(String title, String text) {
		if(checkPassword()) {
			super.createPage(title, text);
		} else {
			System.out.println("taa operaciq nqma da q pravq");
		}
	}

	@Override
	public void replaceText(int pageNumber, String text) throws ReplaceFailedException {
		if(checkPassword()) {
			super.replaceText(pageNumber, text);
		} else {
			System.out.println("taa operaciq nqma da q pravq");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if(checkPassword()) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("taa operaciq nqma da q pravq");
		}
	}

	@Override
	public void printAllPages() {
		if(checkPassword()) {
			super.printAllPages();
		} else {
			System.out.println("taa operaciq nqma da q pravq");
		}
	}
	

	

}
