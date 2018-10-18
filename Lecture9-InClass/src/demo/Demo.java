package demo;

import architecture.Notepad;
import exceptions.ReplaceFailedException;
import notepads.SecuredNotepad;
import notepads.SimpleNotepad;

public class Demo {
	public static void main(String[] args) {
		Notepad securedNotepad = new SecuredNotepad("parola");
		
		securedNotepad.createPage("Voina i mir1", "mnogo voina1");

		securedNotepad.printAllPages();
		
		try {
			securedNotepad.replaceText(4, "oshte poveche voina");
		} catch (ReplaceFailedException e) {
			e.printStackTrace();
			System.out.println("Emi taq operaciq nqma da q byde replace-a");
		}
		
		securedNotepad.printAllPages();

		securedNotepad.deleteText(4);
		
		securedNotepad.printAllPages();
		
//		Notepad simpleNotepad = new SimpleNotepad();
//		simpleNotepad.createPage("Voina i mir1", "mnogo voina1");
//		simpleNotepad.createPage("Voina i mir2", "mnogo voina2");
//		simpleNotepad.createPage("Voina i mir3", "mnogo voina3");
//		simpleNotepad.createPage("Voina i mir4", "mnogo voina4");
//		simpleNotepad.createPage("Voina i mir5", "mnogo voina5");
//		simpleNotepad.createPage("Voina i mir6", "mnogo voina6");
//		
//		simpleNotepad.printAllPages();
//		
//		simpleNotepad.replaceText(4, "oshte poveche voina");
//		
//		simpleNotepad.printAllPages();
//
//		simpleNotepad.deleteText(4);
//		
//		simpleNotepad.printAllPages();
	}
}
