package lesson20_court;

import java.util.Arrays;

public class SideInCase extends Citizen {

	private Lawyer[] lawyers;
	
	public SideInCase(String name) {
		super(name);
		lawyers = new Lawyer[5];
	}

	public Lawyer[] getLawyers() {
		return Arrays.copyOf(lawyers, lawyers.length);
	}

	public void setLawyers(Lawyer[] lawyers) {
		if(lawyers != null){
			this.lawyers = Arrays.copyOf(lawyers, lawyers.length);
		
		}
	}

}
