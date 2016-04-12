package lesson20_court;

public class CivilCase extends Case {

	private Accuser accuser;
	
	public CivilCase(Judge judge, Defendant defendant, Witness[] witnesses, Accuser accuser){
		super(judge, defendant, witnesses);
		
		if(accuser != null){
			this.accuser = accuser;
		}
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
	}
}
