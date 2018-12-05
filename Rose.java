public class Rose extends Flower {

	private static final String NAME = "rose";
	private static final String COLOR = "red";
	double price;

	// constructor
	public Rose(int number) {
		super(number);
		if (PriceList.priceList.containsKey("rose")) {
			price = PriceList.priceList.get("rose");
		} else {
			price = -1;
		}
	}

	// getter - number of flowers
	@Override
	public int getAmount() {
		return number;
	}

	// getter - color of the flowers
	@Override
	public String getColor() {
		return COLOR;
	}

	// getter - price of the flowers
	@Override
	public double getPrice() {
		if (price > 0) {
			return price;
		} else {
			return -1;
		}
	}

	// getter - cost of the flowers
	@Override
	public double getCost() {

		return this.price * this.getAmount();
	}

	// printing
		@Override
		public String print() {
			return Rose.NAME + ", color: " + Rose.COLOR + ", amount " + this.number + ", price " + this.getPrice();
		}

}
