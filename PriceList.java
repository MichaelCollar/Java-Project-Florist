import java.util.HashMap;

public class PriceList extends HashMap<String, Double> {

	private static final long serialVersionUID = 1L;

	static PriceList priceList;

	// constructor
	private PriceList() {
	}

	public static PriceList getInstance() {
		if(priceList == null) {
			priceList = new PriceList();
		}
		return priceList;
	}

}
