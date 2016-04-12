package lesson20_court;

public abstract class Jurist extends Person implements IJurist {

	public Jurist(String name) {
		super(name);
	}
	private String name;
	private int yearsInService;
	private int caseNums;
	
	
	void increaseCaseNums(){
		this.caseNums++;
	}
	
	@Override
	public void askQuestion(Citizen whom){
		if(whom != null){
			System.out.println(this.getName() + " asks " + whom.getName());
		}
	}
	
	@Override
	public void takeNotes() {
		System.out.println(" taking notes ");
		
	}
	
	public void setYearsInService(int years){
		if(years > 0){
			this.yearsInService = years;
		}
	}
	
	public void setCaseNums(int newNums){
		if(newNums > 0){
			this.caseNums = newNums;
		}
	}
	
	
}
