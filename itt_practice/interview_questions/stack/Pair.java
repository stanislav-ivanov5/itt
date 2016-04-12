package com.ampleample.com;
import java.io.*;
import java.util.*;
import java.lang.IllegalArgumentException;


public class Pair {
    private int min = 0;
    private int max = 0;
    private int c;

    public Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Pair(){
    
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void inputPair() {
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("min, max = ");
        int inMin = input.nextInt();
        int inMax = input.nextInt();
        
        setMin(inMin);
        setMax(inMax);
    }
    
    public void sortPair() {
    	if (min > max) { 
    		c = max;
    		max = min;
    		min = c;
    	}
    }
    
//    public int compare(Pair p1, Pair p2) {
//    	if (p1.min < p2.max)
//    		return 1;
//    	if (p1.min > p2.min)
//    		return -1;
//    	if (p1.max < p2.max)
//    		return 1;
//    	if (p1.max > p2.max)
//    		return -1;
//    	return 0;
//    }
    
    public final static Comparator<Pair> FIRST_LIST = new Comparator<Pair>(){
    	
    	public int compare(Pair p1, Pair p2) {
    		if (p1.min < p2.min) { 
    			return -1;
    		}
    		else if (p1.min==p2.min) {
    			if (p1.max < p2.max) {
    				return -1;
    			}
    		else if (p1.max==p2.max) {
    				return 0;
    			}
    		else if (p1.max > p2.max) {
    				return 1;
    			}
    		}
    	return 1;
    	}
    };
    
    public static void main(String[] args) {
        ArrayList<Pair> values = new ArrayList<Pair>();
        Pair pair = new Pair();
        // set pair values:
        
        System.out.println("enter number of pairs: ");
    	Scanner input = new Scanner(System.in);
    	int numPair = input.nextInt();
        
        for (int i = 0; i< numPair; i++ ) {
		    pair.inputPair();
		    pair.sortPair();   
        	values.add(new Pair(pair.getMin(), pair.getMax()));
        }
    	
        for(Pair value : values) {
        	System.out.println(" [" + value.getMin()+", " + value.getMax()+"] ");
        }
        
        Collections.sort(values, FIRST_LIST);
        System.out.println("After sorting: ");
        for ( Pair i : values)
        	System.out.println("[" + i.getMin() + ", " + i.getMax() + "] ");
        
    }
    
    class TimeInterval {
    	
    }

    interface TimeIntervalSource {
    	
    	public List<TimeInterval> getIntervals();
    	
    }
    
    class ConsoleTimeIntervalSource implements TimeIntervalSource {
    	
    }
    
    class TimeIntervalSorter {
    	public TimeIntervalSorter(TimeIntervalSource source) {
    		
    	}  	
    }
    
    public void testA() {
    	
    	TimeIntervalSource src = new TimeIntervalSource() {
			
			@Override
			public List<TimeInterval> getIntervals() {
				TimeInterval t1 = new TimeInterval();
				return null;
			}
		};
    	
		TimeIntervalSorter sorter = new TimeIntervalSorter(src);
		sorter.sort();
    }
}



