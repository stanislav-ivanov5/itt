package lesson20_simplenotepad;

public class SimpleNotepad implements INotepad {

	private static final int PAGES_NUM = 5;
	private static final int ZERO_PAGE = 0;
	private Page[] pages;
	
	public SimpleNotepad(){
		
		this.pages = new Page[PAGES_NUM];
		
		for(int i = 0; i < pages.length; i++){
			pages[i] = new Page("Page " + (i + 1));
		}
	}

	@Override
	public void addText(int pageNum, String text) {
		boolean flag = false;
		
		if(validatePage(pageNum - 1)){
			if(text != null){
				pages[pageNum - 1].addText(text);
				flag = true;
			}
		}

		if(!flag){
			System.out.println("No text was added on that page.");
		}
	}

	@Override
	public void insertText(int pageNum, String text) {
		if(validatePage(pageNum - 1)){
			deleteTextOnPage(pageNum - 1);
			addText(pageNum - 1, text);
		}	
	}

	@Override
	public void deleteTextOnPage(int pageNum) {
		if(validatePage(pageNum - 1)){
			pages[pageNum - 1].deleteText();
		}
	}

	@Override
	public void previewNotepad() {
		for(Page p : pages){
			if(p != null){
				p.preview();
			}
		}
	}

	boolean validatePage(int pageNum){
		if(pageNum >= ZERO_PAGE && pageNum < pages.length){
			return true;
		}
		return false;
	}

	@Override
	public boolean searchWord(String word) {
		boolean check = false;
		for(Page p : pages){
			if(p != null){
				check = p.searchWord(word);
			}
		}
		return check;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(Page p : pages){
			if(p != null && !p.text.equals("")){
				if(!p.containsDigits()){
					p.preview();
				}
			}
		}
		
	}

}
