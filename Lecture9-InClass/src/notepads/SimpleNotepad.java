package notepads;

import java.util.ArrayList;
import java.util.List;

import architecture.Notepad;
import exceptions.ReplaceFailedException;
import utils.Page;

public class SimpleNotepad implements Notepad {

	private List<Page> pages;
	
	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}
	
	@Override
	public void createPage(String title, String text) {
		Page curPage = new Page(title, text, this.pages.size()+1);
		this.pages.add(curPage);
	}

	@Override
	public void replaceText(int pageNumber, String text) throws ReplaceFailedException {
		for (Page curPage : pages) {
			if(curPage.getPageNumber() == pageNumber) {
				curPage.deleteText();
				curPage.addText(text);
				return;
			}
		}
		
		throw new ReplaceFailedException("There was no page with number " + pageNumber);
	}

	@Override
	public void deleteText(int pageNumber) {
		for (Page curPage : pages) {
			if(curPage.getPageNumber() == pageNumber) {
				curPage.deleteText();
				break;
			}
		}
	}

	@Override
	public void printAllPages() {
		for (Page curPage : pages) {
			System.out.println(curPage.reviewPage());
		}
	}

}
