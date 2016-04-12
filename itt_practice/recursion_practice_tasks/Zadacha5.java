package resucrsion_practice_tasks;

/* 
 * check if a number is palindrome
 */
public class Zadacha5 {

	private static int reverse(int original, int reversed) {
        // get the rightmost original digit and remove it
        int rightmost = original % 10;
        original -= rightmost;
        original /= 10;

        // add rightmost original digit to left of reversed
        reversed += rightmost * Math.pow(10, numDigits(original));

        return (original == 0)
            ? reversed
            : reverse(original, reversed);
    }

    public static int numDigits(int number) {
        number = Math.abs(number);

        if (number >= 10) {
            return 1 + numDigits(number /= 10);
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
	
	public static void main(String[] args) {
		
		System.out.println(reverse(-453, 0));
	}
}
