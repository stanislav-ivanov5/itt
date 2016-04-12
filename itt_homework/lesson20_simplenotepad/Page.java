package lesson20_simplenotepad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Page {

	private static final int START_INDEX = 0;
	
	String title;
	StringBuilder text;
	
	public Page(){
		this.text = new StringBuilder();
	}
	
	public Page(String title){
		this();
		
		setTitle(title);
	}
	
	public Page(String title, String text){
		this(title);
		
		addText(text);
	}
	
	boolean searchWord(String word){
		if(word != null){
			return getText().contains(word);
		}
		return false;
	}
	
	boolean containsDigits(){
		
		// checks if the string contains only letters, 
		// if not there are digits as well
		String regex = "[a-zA-Z]*\\n*";
		
		// returns true if there are no digits
		// false - if there is at least 1 digit
		return Pattern.matches(regex, getText());
	}
	
	String replaceSymbols(String text){
		text = text.replace(" ", "");
		text = text.replace(",", "");
		text = text.replace(".", "");
		text = text.replace("?", "");
		
		return text;
	}
	
	void addText(String text){
		if(text != null){
			this.text.append(text);
		}
		else {
			System.out.println("No text was added.");
		}
	}
	
	void deleteText(){
		this.text.delete(START_INDEX, text.length());
	}
	
	void preview(){
		System.out.println("Title: " + this.getTitle() + "\nText:  " + this.getText().toString() + "\n");
	}
	
	private String getTitle(){
		return this.title;
	}
	
	private String getText(){
		return this.text.toString();
	}
	
	private void setTitle(String title){
		if(title != null){
			this.title = title;
		}
		else {
			System.out.println("No title was set. ");
		}
	}

}
