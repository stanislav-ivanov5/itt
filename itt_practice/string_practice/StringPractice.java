package string_practice;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		String str = new String("xax");

		
		System.out.println(str.length());
		System.out.println(str.charAt(1+1));
		
		char a = str.charAt(1);
		System.out.println(" " + a + true);
		
		String str1 = "abc";
		String str2 = "xaxa";
		
//		Scanner sc = new Scanner(System.in);
//		
//		String str3 = sc.next();
		
		if(str2 == str){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		System.out.println(str1.equals(str));
		
		System.out.println(str2.compareTo(str));
		
		String str5 = str2.replace("a", "b");
		System.out.println(str5);
		
		System.out.println(str5.contains("a"));
		
		System.out.println(str5.substring(2, 3));
		
		String[] substr = str1.split("b");
		for (int i = 0; i < substr.length; i++) {
			System.out.print(substr[i] + " ");
		}
	}
}
