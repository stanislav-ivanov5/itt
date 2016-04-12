package comparator_lambdas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		Set<Frame> frames = new TreeSet<Frame>(new FramePriceComparator() {
			@Override
			public int compare(Frame f1, Frame f2) {
				if (super.compare(f1, f2) == 0) {
					return f1.size - f2.size;
				}
				return super.compare(f1, f2);
			}
		});

		Comparator<Frame> myComparator = ((f1, f2) ->  f1.price - f2.price);
		
		Set<Frame> frameTypes = new TreeSet<Frame>(
				);

	}
}
