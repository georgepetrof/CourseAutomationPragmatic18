package notepads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import architecture.ElectronicDevice;
import architecture.Notepad;
import exceptions.ReplaceFailedException;
import utils.Page;

/**
 * This class is for ElectronicSecuredNotepad which is SecuredNotepad and ElectronicDevice
 * @author George
 *
 */
public class ElectronicSecuredNotepad extends SecuredNotepad implements ElectronicDevice {

	private boolean isDeviceStarted;

	public ElectronicSecuredNotepad(String password) {
		super(password);
		this.isDeviceStarted = true;
	}

	@Override
	public void start() {
		this.isDeviceStarted = true;

	}

	@Override
	public void stop() {
		this.isDeviceStarted = false;
	}

	@Override
	public boolean isStarted() {
		return isDeviceStarted;
	}

	@Override
	public void createPage(String title, String text) {
		if (isStarted()) {
			super.createPage(title, text);
		} else {
			System.out.println("The ESN in not starte");
		}

	}

	@Override
	public void replaceText(int pageNumber, String text) throws ReplaceFailedException {
		if (isStarted()) {
			super.replaceText(pageNumber, text);
		} else {
			System.out.println("The ESN in not started");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isStarted()) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("The ESN in not started");
		}
	}

	@Override
	public void printAllPages() {
		if (isStarted()) {
			super.printAllPages();
		} else {
			System.out.println("The ESN in not started");
		}
	}

}
