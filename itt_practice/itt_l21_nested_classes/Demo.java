package lesson21_nested_classes;

import java.awt.Image;

import lesson21_nested_classes.OuterClass.InnerDjanka;

public class Demo {

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		oc.accessFromTheNested();
		
		
		OuterClass.NestedStatic nss = new OuterClass.NestedStatic();
		nss.printMemberFromOuter();
		
		OuterClass.InnerDjanka id = oc.new InnerDjanka();
		
		oc.produce("CableMouse").transmit();
		
		Technician techy = new Technician();
		techy.repair().transmit();
		
		IMouse.method().repair().transmit();
	}
}
