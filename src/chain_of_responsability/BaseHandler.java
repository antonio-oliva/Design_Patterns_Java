package chain_of_responsability;

public class BaseHandler implements Handler {
	/*
	 * The default chaining behavior can be implemented inside a base handler class.
	 */
	private Handler _next_handler;

	public Handler set_next(Handler handler) {
		this._next_handler = handler;
		return handler;
	}

	public String handle(String request) {
		if (this._next_handler != null) {
			return this._next_handler.handle(request);
		}
		return null;
	}
}
