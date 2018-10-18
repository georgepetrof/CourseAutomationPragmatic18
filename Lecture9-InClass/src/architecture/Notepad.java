package architecture;

import exceptions.ReplaceFailedException;

public interface Notepad {
	void createPage(String title, String text);
	void replaceText(int pageNumber, String text) throws ReplaceFailedException;
	void deleteText(int pageNumber);
	void printAllPages();
}
