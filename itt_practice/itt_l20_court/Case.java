package lesson20_court;

import java.util.Arrays;

public class Case implements ICase {

	private Judge judge;
	private Jury[] jury;
	private Defendant defendant;
	private Accuser accuser;
	private Witness[] witnesses; // SET structure

	public Case(Judge judge, Defendant defendant, Witness[] witnesses){
		
	}
	
	@Override
	public void perform() {
		
		
	}

	public Judge getJudge() {
		return judge;
	}

	public void setJudge(Judge judge) {
		if(judge != null){
			this.judge = judge;
		}
	}

	public Jury[] getJury() {
		return Arrays.copyOf(jury, jury.length);
	}

	public void setJury(Jury[] jury) {
		if(jury != null){
			this.jury = Arrays.copyOf(jury, jury.length);
		}
	}

	public Defendant getDefendant() {
		return defendant;
	}

	public void setDefendant(Defendant defendant) {
		if(defendant != null){
			this.defendant = defendant;
		}
	}

	public Witness[] getWitnesses() {
		return Arrays.copyOf(witnesses, witnesses.length);
	}

	public void setWitnesses(Witness[] witnesses) {
		if(witnesses != null){
			this.witnesses = Arrays.copyOf(witnesses, witnesses.length);
		}
	}
	
}
