package decorator;

public class Decorator_Demo {
	private static void client_code(Notifier notifier) {
		/*
		 * The client code works with all objects using the Component interface.
		 * This way it can stay independent of the concrete classes of components it works with.
		 */
		System.out.println("RESULT:\n " + notifier.send());
	}
	
	
	public static void main(String[] args) {
		// The client code can support both simple components...
		ConcreteNotifier simple = new ConcreteNotifier();
		System.out.println("Client: I've got a simple notifier:");
	    client_code(simple);

	    System.out.println("\n");
	    
	    // ...as well as decorated ones.
	    
	    // Decorators can wrap not only simple components but the other decorators as well.
	    SmsDecorator decorator1 = new SmsDecorator(simple);
	    FacebookDecorator decorator2 = new FacebookDecorator(decorator1);
	    System.out.println("Client: Now I've got a decorated notifier:");
	    client_code(decorator2);
	    System.out.println("\n");
	}
}
