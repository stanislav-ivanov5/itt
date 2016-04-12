package lesson24_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;

public class Demo2 implements Set, Comparable{
	
	private static int counter = 0;
	private int index;
	private Object o;
	
	public Demo2(Object o){
		counter += 1;
		this.index = counter;
	}

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("3");
		list.add("4");
		list.add("5");
	
		list.add(2, "9");
		
		// Use list as a set, i.e. check for duplicates
		if(!list.contains("3")){
			list.add("3");
		}
		else {
			System.out.println("List already contains 3");
		}
		System.out.println(list.toString());
		
		
		Queue<String> qu = new PriorityBlockingQueue<String>();
		qu.add("5");
		
		Stack<String> st = new Stack<String>();
		st.add("6");
		st.add("6");
		System.out.println(st.size());
		System.out.println(st.size());
		
		// use set as a list
		Set<Demo2> set = new TreeSet<Demo2>();
//		set.add("3");
//		set.add("4");
//		set.add("5");
		
		Demo2 ob1 = new Demo2("7");
		Demo2 ob2 = new Demo2("8");
		Demo2 ob3 = new Demo2("9");
		
		set.add(ob1);
		set.add(ob2);
		set.add(ob3);
		
		for(Iterator it = set.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
		int b = 5;
		int c = 5;
//		compile Error
//		System.out.println(b.equals(c));
	}

	@Override
	public String toString() {
		return ((Integer)this.index).toString();
	}
	
	@Override
	public boolean add(Object e) {
		if(((Demo2)e).index == this.index){
			
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {

		return this.index == ((Demo2)obj).index;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
