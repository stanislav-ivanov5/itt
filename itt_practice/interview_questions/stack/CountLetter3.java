package com.ampleample.com;

public class CountLetter3 {
	String str = "ehello", s = str;
	int count = 0;
	
	public void print(){
		while(s.length()>0){
			count = 0;
        	for(int i=0;i<s.length();i++){
        		if(s.charAt(i)==s.charAt(0))
        			count++;
        		}
        	System.out.println(s.charAt(0)+": "+count);
        	s = s.replace(String.valueOf(s.charAt(0)), "");
        	}
        }
        
        public static void main(String[] args){
        	new CountLetter3().print();
        }
        
}
