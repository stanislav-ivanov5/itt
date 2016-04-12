package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Arrays {

	public static void main(String[] args) {
		
		String[] stringArr = new String[6];
		System.out.print(stringArr.length);
		
		List<Integer> arr = new ArrayList<Integer>();
		int a = arr.get(6);
		System.out.println(a);
		
		
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("e");
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(0, "petko");
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("just a string");
		
		Stack<Integer> stack4e = new Stack<>();
		stack4e.peek();
	}

}
