package financecalculator;

public class InterestCalculator {

	static final double YEAR_CONTRIBUTION = 1200;

	public static void main(String[] args) {
		
		double amount = 0;
		double principal = 1000;
		double rate = 0.03;
		
		
		for (int year = 1; year <= 10; year++) {
			System.out.println("Amount ** : " + amount);
			amount = principal * (double) (Math.pow(1 + rate , year));
			principal += YEAR_CONTRIBUTION;
			
			System.out.println("Amount: " + amount);
		}
	}
}
