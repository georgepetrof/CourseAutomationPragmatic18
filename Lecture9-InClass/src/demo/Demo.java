package demo;

import architecture.Notepad;
import exceptions.ReplaceFailedException;
import notepads.ElectronicSecuredNotepad;
import notepads.SecuredNotepad;
import notepads.SimpleNotepad;


/**
 * Class Demo is for representing the futures of the Notepade and his variants 
 * @author George
 *
 */
public class Demo {
	public static void main(String[] args) {
		
		
		SecuredNotepad test1 = new ElectronicSecuredNotepad("0000");
		
		test1.createPage("Stranica1", "Texta na stranica 1");
		test1.createPage("Stranica2", "Texta na stranica 2");
		test1.createPage("Stranica3", "Texta na stranica 3");
		test1.createPage("Stranica4", "Texta na stranica 4");
		
		test1.printAllPages();
		
		
		
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
