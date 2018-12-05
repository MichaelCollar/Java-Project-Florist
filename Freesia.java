public class Freesia extends Flower {

	private static final String NAME = "freesia";
	private static final String COLOR = "yellow";
	private double price;

	// constructor
	public Freesia(int number) {
		super(number);
		if (PriceList.priceList.containsKey("freesia")) {
			price = PriceList.priceList.get("freesia");
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
			return Freesia.NAME + ", color: " + Freesia.COLOR + ", amount " + this.number + ", price " + this.getPrice();
		}

}
