package lesson20_simplenotepad;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SecuredNotepad extends Secured implements INotepad {

	private String password;
	private boolean digitCount;
	private boolean smallLetter;
	private boolean capitalLetter;
	
	public SecuredNotepad(String password){
		super();
		
		if(password == null){
			throw new NullPointerException("The password must be not null.");
		}
		
		
		if(validateStrongPass(password)){
			setPassword(password);		
		}
		else {
			throw new IllegalArgumentException("Password should be strong.");			
		}
	}
	
	boolean validateStrongPass(String pass){
		
		if(pass.length() < 5){
			return false;
		}

		for (int i = 0; i < pass.length(); i++) {
			if(Character.isDigit(pass.charAt(i))){
				digitCount = true;
			}
			if(Character.isUpperCase(pass.charAt(i))){
				capitalLetter = true;
			}
			if(Character.isLowerCase(pass.charAt(i))){
				smallLetter = true;
			}
		}
		
		if(digitCount && capitalLetter && smallLetter){
			return true;
		}
		
		return false;
	}
	
	
	
	@Override
	public void addText(int pageNum, String text) {
		if(authenticate()){
			super.addText(pageNum, text);
		}
	}

	@Override
	public void insertText(int pageNum, String text) {
		if(authenticate()){
			super.insertText(pageNum, text);
		}
	}

	@Override
	public void deleteTextOnPage(int pageNum) {
		if(authenticate()){
			super.deleteTextOnPage(pageNum);
		}
	}

	@Override
	public void previewNotepad() {
		if(authenticate()){
			super.previewNotepad();
		}
	}

	protected boolean authenticate() throws NoSuchElementException {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
//		try{
			String pass = sc.nextLine();
			sc.close();
			if(pass.equals(this.password)){
				return true;
			}
//		} catch (NoSuchElementException noEl){
			
//		}
		
		System.out.println("Wrong password. ");
		return false;
	}
	
	protected void setPassword(String password){
		if(password != null){
			this.password = password;			
		}
		else {
			System.out.println("Invalid password");
		}
	}
}
