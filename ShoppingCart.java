import java.util.ArrayList;

public class ShoppingCart extends Shopping {

	ArrayList<Flower> cartOfFlowers;

	// constructor
	public ShoppingCart(Customer customer) {
		super(customer);
		cartOfFlowers = new ArrayList<Flower>();
	}

	// adding flowers to the cart
	public void addFlower(Flower flower) {
		cartOfFlowers.add(flower);
	}

	// removing flowers from the cart
	public void removeFlower(int i) {
		cartOfFlowers.remove(i);
	}

	@Override
	public void removeFlower(Flower flower) {
		cartOfFlowers.remove(cartOfFlowers.indexOf(flower));
	}

	// removing products from the cart if there is no set price
	public void removeIfNoPrice() {
		for (int i = 0; i < cartOfFlowers.size(); i++) {
			if (cartOfFlowers.get(i).getPrice() == -1)
				this.removeFlower(i);
		}
	}

	// printing
	@Override
	public String toString() {
		String printCart = "Owner of the cart: " + this.customer.name + "\n";
		if (cartOfFlowers != null) {
			for (int i = 0; i < cartOfFlowers.size(); i++) {
				if (i >= cartOfFlowers.size() - 1) {
					printCart += cartOfFlowers.get(i).print() ;
				} else {
					printCart += cartOfFlowers.get(i).print() + "\n";
				}
			}
		} else {
			printCart = "Owner of the cart: " + this.customer.name + " -- empty";
		}
		return printCart;
	}

}
