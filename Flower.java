public abstract class Flower {

	int number;

	// constructor
	public Flower(int number) {
		this.number = number;
	}

	// abstract methods

	//getter - number of flowers
	public abstract int getAmount();

	//getter - color of the flowers
	public abstract String getColor();

	//getter - price of the flowers
	public abstract double getPrice();

	//getter - cost of the flowers
	public abstract double getCost();

	// printing
	public abstract String print();

}
