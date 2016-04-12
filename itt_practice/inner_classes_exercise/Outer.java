package inner_classes_exercise;

public class Outer {

	Inner returnInner() {
		return new Inner("default");
	}

	class Inner {
		private String string;
		
		public Inner(String s){
			this.string = s;
		}

		@Override
		public String toString() {
			return this.string;
		}
	}

	class Inner2 {

	}

	public static void main(String[] args) {

		Outer.Inner inner = new Outer().new Inner("s");
	}
}
