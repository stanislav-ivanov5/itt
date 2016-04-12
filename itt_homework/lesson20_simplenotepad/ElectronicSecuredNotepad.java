package lesson20_simplenotepad;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends Secured implements IElectronicDevice {

	private String password;
	private boolean isStarted;
	
	public ElectronicSecuredNotepad(String password) {
		super();
		start();
		setPassword(password);

	}

	@Override
	public void start() {
		if(!isStarted()){
			this.isStarted = true;			
		}
	}

	@Override
	public void stop() {
		if(isStarted()){
			this.isStarted = false;			
		}
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addText(int pageNum, String text) {
		if(isStarted()){
			if(authenticate()){
				super.addText(pageNum, text);				
				
			}
		}
	}

	@Override
	public void insertText(int pageNum, String text) {
		if(isStarted()){
			if(authenticate()){
				super.insertText(pageNum, text);
			}
		}
	}

	@Override
	public void deleteTextOnPage(int pageNum) {
		if(isStarted()){
			if(authenticate()){
				super.deleteTextOnPage(pageNum);
			}
		}
	}

	@Override
	public void previewNotepad() {
		if(isStarted()){
			if(authenticate()){
				super.previewNotepad();				
			}
		}
	}

	@Override
	protected boolean authenticate(){
		if(isStarted()){
			System.out.println("Enter password");
			Scanner sc = new Scanner(System.in);
			String pass = sc.nextLine();
			sc.close();
			
			if(pass.equals(this.password)){
				return true;
			}
		}
		System.out.println("Wrong password. ");
		return false;
	}
	
	@Override
	protected void setPassword(String password){
		if(isStarted()){
			if(password != null){
				this.password = password;			
			}
			else {
				System.out.println("Invalid password");
			}
		}
	}
	
}
