package lesson20_court;

public class Prosecutor extends Jurist {

	public Prosecutor(String name) {
		super(name);
	}
	
	@Override
	public void setYearsInService(int years) {
		if(years >= 10){
			super.setYearsInService(years);
		}
	}

}
