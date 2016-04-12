package randomGenerator;

public class RandomExamdom {

	public static int randGen(){
		int result = (int) (Math.random() * ( 64 - 1) + 1 );
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(RandomExamdom.randGen());
		
	}
}
