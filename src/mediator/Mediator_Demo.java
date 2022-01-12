package mediator;

public class Mediator_Demo {

	public static void main(String[] args) {
		// The client code
		Component1 c1 = new Component1();
		Component2 c2 = new Component2();
		Mediator mediator = new Mediator(c1, c2);
		
		System.out.println("Client triggers Component 1 operation A.");
		c1.do_a();
		
		System.out.println("\n");
		
		System.out.println("Client triggers Component 2 operation D.");
		c2.do_d();

	}

}
