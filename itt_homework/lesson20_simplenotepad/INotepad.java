package lesson20_simplenotepad;

public interface INotepad {

	public abstract void addText(int pageNum, String text);
	public abstract void insertText(int pageNum, String text);
	public abstract void deleteTextOnPage(int pageNum);
	public abstract void previewNotepad();
	
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
