public class Peony extends Flower {

	private static final String NAME = "peony";
	private static final String COLOR = "red";
	double price;

	// constructor
	public Peony(int number) {
		super(number);
		if (PriceList.priceList.containsKey("peony")) {
			price = PriceList.priceList.get("peony");
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
			return Peony.NAME + ", color: " + Peony.COLOR + ", amount " + this.number + ", price " + this.getPrice();
		}
}
