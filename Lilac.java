public class Lilac extends Flower {

	private static final String NAME = "lilac";
	private static final String COLOR = "white";
	double price;

	// constructor
	public Lilac(int number) {
		super(number);
		if (PriceList.priceList.containsKey("lilac")) {
			price = PriceList.priceList.get("lilac");
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
			return Lilac.NAME + ", color: " + Lilac.COLOR + ", amount " + this.number + ", price " + this.getPrice();
		}
}
