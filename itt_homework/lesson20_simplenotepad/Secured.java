package lesson20_simplenotepad;

public abstract class Secured extends SimpleNotepad {

	protected abstract boolean authenticate();
	protected abstract void setPassword(String password);
	
}
