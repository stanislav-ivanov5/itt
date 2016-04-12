package lesson21_local_class;

public class OuterClass {

	static String regularExpression = "[^0-9]";
	
	public static void validatePhoneNumber(String number1, String number2){

		final int numberLength = 10;
		
		class PhoneNumber{
			
			String formattedPhoneNumber = null;
			
			PhoneNumber(String phoneNumber){
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				
				if(currentNumber.length() == numberLength){
					formattedPhoneNumber = currentNumber;
				} else {
					formattedPhoneNumber = null;
				}
			
			}
			
			public String getNumber(){
				return formattedPhoneNumber;
			}
		}
		
		
		PhoneNumber myNumber1 = new PhoneNumber(number1);
		PhoneNumber myNumber2 = new PhoneNumber(number2);
		
		if(myNumber1.getNumber() == null){
			System.out.println("first number invalid");
		} else {
			System.out.println("First number: " + myNumber1.getNumber());
		}
		if(myNumber2.getNumber() == null){
			System.out.println("second number invalid");
		} else {
			System.out.println("Second number: " + myNumber2.getNumber());
		}
	}
	
	public static void main(String[] args) {
		
		validatePhoneNumber("123-456-788", "555-888-9999");
	}
}
