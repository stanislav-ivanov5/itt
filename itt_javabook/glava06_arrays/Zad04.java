package glava06_arrays;

// new array[15] chars, check if it;s ['a' .. 'z'] 
public class Zad04 {

	public static void main(String[] args) {
		
		char[] arr = {'9', '0', '1', '0', '1', '0', '1', '0', 
				'1', '0', '1', 'f', '1', '0', '3',};
		
//		97-122
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++){
			if((int)arr[i] >= 97 && (int)arr[i] <= 122){
				flag = true;
				System.out.println(arr[i]);
				break;
			}
		}
		
		if(flag) {
			System.out.println("contains symbol a..z");
		}
		else{
			System.out.println("doesn't contain symbol a..z");
		}
	}
}
