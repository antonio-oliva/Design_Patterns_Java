package chain_of_responsability;

public class Chain_of_Responsability_Demo {
	
	public static void client_code(Handler handler) {
		/*
		 * The client code is usually suited to work with a single handler.
		 * In most cases, it is not even aware that the handler is part of a chain.
		 */
		String[] foods = {"Nut", "Banana", "Cup of coffee"};
		for (String food: foods) {
			System.out.println("\nClient: Who wants a " + food + "?");
			String result = handler.handle(food);
			if (result != null) {
				System.out.println("\t" + result);
			}else {
				System.out.println("\t" + food + " was left untouched.");
			}
		}
	}

	public static void main(String[] args) {
		MonkeyHandler monkey = new MonkeyHandler();
		SquirrelHandler squirrel = new SquirrelHandler();
		DogHandler dog = new DogHandler();
		
		monkey.set_next(squirrel).set_next(dog);
		
		// The client should be able to send a request to any handler, not just the first one in the chain.
	    System.out.println("Chain: Monkey > Squirrel > Dog");
	    client_code(monkey);
	    System.out.println("\n");

	    System.out.println("Sub-chain: Squirrel > Dog");
	    client_code(squirrel);

	}

}
