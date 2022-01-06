package proxy;

public interface Service {
	/* 
	 * The Service interface declares common operations for both RealService and the Proxy. 
	 * As long as the client works with RealService using this interface, you'll be able to pass it a proxy instead of a real service.
	 */
	public void request();
}
