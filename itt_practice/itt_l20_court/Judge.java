package lesson20_court;

public class Judge extends Jurist {

	public Judge(String name) {
		super(name);
	}



	@Override
	public void setYearsInService(int years) {
		if(years >= 5){
			super.setYearsInService(years);
		}
		
	}

	



}
