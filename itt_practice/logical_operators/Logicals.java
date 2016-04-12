package logicaloperators;

public class Logicals {

	public static void main(String[] args) {
		
		// these are boolean variables     
	      boolean A = true;
	      boolean B = false; 

	      System.out.println("A|B = "+(A|B));
	      System.out.println("A&B = "+(A&B));
	      System.out.println("!A = "+(!A));
	      System.out.println("A^B = "+(A^B));
	      System.out.println("(A|B)&A = "+((A|B)&A));
	      
	      System.out.println("A|B = "+(A||B));
	      System.out.println("A&B = "+(A&&B));
	      System.out.println("!A = "+(!A));
	      System.out.println("A^B = "+(A^B));
	      System.out.println("(A|B)&A = "+((A|B)&A));
	}
}
