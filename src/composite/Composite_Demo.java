package composite;

public class Composite_Demo {
	
	public static void client(Component component) {
		System.out.println("Component price: " + String.format("%.2f", component.price()) + " €");
	}
	

	public static void main(String[] args) {
		// The client code can support the simple Product components...
		Product simple = new Product(11.2);
		System.out.println("\nClient: I've got a simple component:");
		client(simple);
		
		// ...as well as complex composites
	    Box box = new Box(1.25);

	    Box smallerBox1 = new Box(0.8);
	    smallerBox1.add(new Product(4.25));
	    smallerBox1.add(new Product(1.3));

	    Box smallerBox2 = new Box(0.5);
	    smallerBox2.add(new Product(2.05));

	    box.add(smallerBox1);
	    box.add(smallerBox2);

	    System.out.println("\nClient: I've got a complex composite component:");
	    client(box);
	}

}
