package chain_of_responsability;

public class SquirrelHandler extends BaseHandler {
	/*
	 * All Concrete Handlers either handle a request or pass it to the next handler in the chain.
	 */
	public String handle(String request) {
		if (request.equals("Nut")) {
			return "Squirrel: I'll eat the " + request;
		}
		return super.handle(request);
	}
}