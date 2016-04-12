package lesson20_court;

public class Lawyer extends Jurist {

	private static final int YEARS_SERVICE = 10;


	public Lawyer(String name, int caseNums) {
		super(name);
		this.setCaseNums(caseNums);
	}


	@Override
	public void takeNotes() {
		System.out.println(this.getName() + " takes notes ");

	}


	@Override
	public void setYearsInService(int years) {
		if(years >= YEARS_SERVICE){
			super.setYearsInService(years);
		}
	}

}
