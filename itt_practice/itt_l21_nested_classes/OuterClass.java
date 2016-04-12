package lesson21_nested_classes;

public class OuterClass {

	private String value = "value";
	private static int count = 1;

	void accessFromTheNested() {
		System.out.println(NestedStatic.name);
		// System.out.println(NestedStatic.age); ERR
		new OuterClass.InnerDjanka().x = 7;
		
		addLocalClass();
	}
	
	IMouse produce(String type){
		
		class CableMouse implements IMouse {

			@Override
			public void transmit() {
				System.out.println("when clicked forward the signal on cable");
				
			}
			
		}
		
		class WirelessMouse implements IMouse{

			@Override
			public void transmit() {
				System.out.println("When clicked transmit the signal somewhere");
			}
			
		}
		
		if(type.equals("CableMouse"))
			return new CableMouse();
		
		return new WirelessMouse();
	}
	
	
	void addLocalClass(){
		class LocalClass{
			private int t = 51;
			
			void print(){
				t = 5;
				System.out.println(this.t);
			}
		}
		
		new LocalClass().print();
	}

	class InnerDjanka {
		
		int x = 4;

		void printFromOuter() {
			System.out.println(value);
			System.out.println(count);

			this.x = 5;
		}
	}

	static class NestedStatic {
		protected static String name = "name";
		protected int age = 20;

		public void printMemberFromOuter() {
			System.out.println(count);
			// System.out.println(value); ERR
		}
	}

}
