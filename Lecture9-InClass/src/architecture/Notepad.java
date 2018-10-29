package architecture;


import exceptions.ReplaceFailedException;

/**
 * This is an Interface for Notepad
 * @author George
 * 
 */

public interface Notepad {
	
	
	void createPage(String title, String text);
	void replaceText(int pageNumber, String text) throws ReplaceFailedException;
	void deleteText(int pageNumber);
	void printAllPages();
}
