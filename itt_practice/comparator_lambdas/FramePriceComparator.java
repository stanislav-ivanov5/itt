package comparator_lambdas;

import java.util.Comparator;

public class FramePriceComparator implements Comparator<Frame>{

	@Override
	public int compare(Frame f1, Frame f2) {

		return f1.price - f2.price;
	}

	
}
