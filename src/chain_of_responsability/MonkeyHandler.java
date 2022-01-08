package chain_of_responsability;

public class MonkeyHandler extends BaseHandler {
	/*
	 * All Concrete Handlers either handle a request or pass it to the next handler in the chain.
	 */
	public String handle(String request) {
		if (request.equals("Banana")) {
			return "Monkey: I'll eat the " + request;
		}
		return super.handle(request);
	}
}