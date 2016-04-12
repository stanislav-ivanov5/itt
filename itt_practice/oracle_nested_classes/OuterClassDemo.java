package oraclenestedclasses;

import oraclenestedclasses.OuterClass.InnerClass;

public class OuterClassDemo {

	public static void main(String[] args) {
		
		OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
		
		System.out.println(staticNested.getClass());
		
		OuterClass outC = new OuterClass();
		
		OuterClass outerObject = new OuterClass();
		
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	
	}
}
