public class Customer {

	String name;
	private double money;
	private ShoppingCart cart;

	// constructor
	public Customer(String name, double money) {
		this.name = name;
		this.money = money;
		cart = new ShoppingCart(this);
	}

	// getter - money
		public double getCash() {
			return money;
		}

	// getter - content of cart
	public ShoppingCart getShoppingCart() {
		return cart;
	}

	// adding flowers to the cart
	public void get(Flower flower) {
		cart.addFlower(flower);
	}

	// paying for the flowers in the cart
	public void pay() {

		// removing products from the cart if there is no price set
		cart.removeIfNoPrice();

		for (int i = 0; i < cart.cartOfFlowers.size(); i++) {
			double cost = 0;
			// removing products from the cart if there is not enough money
			if (money - (cart.cartOfFlowers.get(i).getCost() + cost) < 0) {
				cart.removeFlower(i);
			} else {
				cost = cart.cartOfFlowers.get(i).getCost();
				money -= cost;
			}
		}
	}

	// packing flowers to the box and removing from the cart
	public void pack(Box box) {
		for (Flower f : cart.cartOfFlowers) {
			box.addFlower(f);
			cart.cartOfFlowers = null;
		}
	}

}
