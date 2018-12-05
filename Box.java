import java.util.ArrayList;

public class Box extends Shopping {

	ArrayList<Flower> boxOfFlowers;

	// constructor
	public Box(Customer customer) {
		super(customer);
		boxOfFlowers = new ArrayList<Flower>();
	}

	// adding flowers to the box
	public void addFlower(Flower flower) {
		boxOfFlowers.add(flower);
	}

	// removing flowers from the box
	public void removeFlower(int number) {
		boxOfFlowers.remove(number);
	}

	@Override
	public void removeFlower(Flower flower) {
		boxOfFlowers.remove(boxOfFlowers.indexOf(flower));
	}

	// printing
	@Override
	public String toString() {
		String printBox = "Owner of the box: " + this.customer.name + "\n";
		if (boxOfFlowers != null) {
			for (int i = 0; i < boxOfFlowers.size(); i++) {
				if (i >= boxOfFlowers.size() - 1) {
					printBox += boxOfFlowers.get(i).print();
				} else {
					printBox += boxOfFlowers.get(i).print() + "\n";
				}
			}
		} else {
			printBox = "Owner of the box: " + this.customer.name + " -- pusto";
		}
		return printBox;

	}
}
