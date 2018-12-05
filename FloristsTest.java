public class FloristsTest {
  // adding the value of flowers of the given color
  static int valueOf(Box box, String color) {
	int boxOfFlowers = 0;
	for (Flower f : box.boxOfFlowers) {
	  if (f.getColor() == color) {
	    boxOfFlowers = (int) (boxOfFlowers + ( f.getCost()));
	  }
	}
	return boxOfFlowers;
  }

  public static void main(String[] args) {
    // Self-service florist
    // price list
    PriceList pl = PriceList.getInstance();
    pl.put("rose", 10.0);
    pl.put("beige", 12.0);
    pl.put("peony", 8.0);

    // a client named John comes and has 200 PLN
    Customer john = new Customer("John", 200);

    // he takes different flowers: 5 roses, 5 peonies, 3 freesias, 3 lilacs
    john.get(new Rose(5));
    john.get(new Peony(5));
    john.get(new Freesia(3));
    john.get(new Lilac(3));

    // let's see what's on the shopping cart
    ShoppingCart cartJohn = john.getShoppingCart();
    System.out.println("Before paying\n" + cartJohn);

    // he pays...
    john.pay();

    System.out.println("After paying\n" + john.getShoppingCart());

    System.out.println("John has: " + john.getCash() + " PLN");

    // packing flowers into the box
    Box boxJohn = new Box(john);
    john.pack(boxJohn);

    // what remained in the shopping cart
    System.out.println("After packing flowers into the box\n" + john.getShoppingCart());

    // what is in the box
    System.out.println(boxJohn);

    // let's see what is the value of red flowers in John's box
    System.out.println("Red flowers in John's box costed: "
        + valueOf(boxJohn, "red"));

    // Steven comes and has only 60 PLN
    Customer steven = new Customer("Steven", 60);

    // he wants to buy too many flowers
    steven.get(new Lilac(3));
    steven.get(new Rose(5));

    // what is in his shopping cart
    System.out.println(steven.getShoppingCart());

    // he pays and packs into the box
    steven.pay();
    Box boxSteven = new Box(steven);
    steven.pack(boxSteven);

    // what he finally bought
    System.out.println(boxSteven);
    // how much money he has left
    System.out.println("Steven has: " + steven.getCash() + " PLN");
  }
}
