package chain_of_responsability;

public interface Handler {
	/*
	 * The Handler interface declares a method for building the chain of handlers. 
	 * It also declares a method for executing a request.
	 */
	public Handler set_next(Handler handler);

	public String handle(String request);

}
