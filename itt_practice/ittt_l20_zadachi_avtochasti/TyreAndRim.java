package lesson20_zadachi_avtochasti;

public abstract class TyreAndRim extends Part implements Category {

	public TyreAndRim(String name, int buyPrice, int sellPrice) {
		super(2, name, buyPrice, sellPrice);
	}

}
