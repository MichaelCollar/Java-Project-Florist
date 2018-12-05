public abstract class Shopping {

	Customer customer;

	// constructor
	public Shopping(Customer customer) {
		this.customer = customer;
	}

	public abstract void addFlower(Flower flower);

	public abstract void removeFlower(Flower flower);

	public abstract void removeFlower(int number);

	public abstract String toString();
}
