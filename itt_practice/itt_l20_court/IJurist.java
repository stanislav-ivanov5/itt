package lesson20_court;

public interface IJurist {

	void askQuestion(Citizen whom);
	void takeNotes();
	void setYearsInService(int years);
	void setCaseNums(int nums);
}
