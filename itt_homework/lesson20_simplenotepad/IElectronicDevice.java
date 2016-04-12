package lesson20_simplenotepad;

public interface IElectronicDevice extends INotepad {

	void start();
	void stop();
	boolean isStarted();
}
