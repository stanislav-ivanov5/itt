package interview_questions.switch;

public class SwitchClass {

	public static void main(String[] args) {

		int bn = (int) (Math.random() * 10);

		System.out.println("How many bn will you have in 5 years?");
		System.out.println("you have " + bn);
		switch (bn) {
		case 1:
			System.out.println("You're not poor enough");
			break;
		case 2:
			System.out.println("Maybe you can make it");
			break;
		case 3:
			System.out.println("It'd be enough for a tiny cottage");
			break;
		case 4:
			System.out
					.println("Well, there're still a hundred people with more money");
			break;
		case 5:
			System.out.println("You've just 4 bn above the first one");
			break;
		case 6:
			System.out.println("Still not enough to open a bank");
			break;
		case 7:
			System.out.println("Would be enough to open a bank account");
			break;
		case 8:
			System.out.println("The guys from IBD will be interested");
			break;
		default:
			System.out
					.println("You either have more than 8 bn, or less than 1 bn");
			break;
		}
	}

}
