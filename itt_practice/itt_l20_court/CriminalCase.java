package lesson20_court;

public class CriminalCase extends Case {

	private static final int JURY_NUM = 13;

	private Prosecutor prosecutor;
	
	public CriminalCase(Judge judge, Defendant defendant, Witness[] witnesses, Prosecutor prosecutor){
		super(judge, defendant, witnesses);
		
		if(prosecutor != null){
			this.prosecutor = prosecutor;
		}
	}
}
