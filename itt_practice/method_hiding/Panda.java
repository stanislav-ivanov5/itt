package method_hiding;

public class Panda extends Bear {
	  
	public static void sneeze() {  // DOES NOT COMPILE
		System.out.println("Panda bear sneezes quietly");
	}
		  
	public static void hibernate() {  // DOES NOT COMPILE
		System.out.println("Panda bear is going to sleep");	  
	}
}
