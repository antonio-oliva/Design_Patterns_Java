package proxy;

public class Proxy implements Service {
	/*
	 * The Proxy has an interface identical to the RealService.
	 */
	private RealService real_service;
	
	public Proxy(RealService real_service) {
		this.real_service = real_service;
	}
	
	private boolean check_access() {
		System.out.println("Proxy: Checking access prior to firing a real request.");
		return true;
	}
	
	private void log_access() {
		System.out.println("Proxy: Logging the time of request.");
	}
	
	public void request() {
		/*
		 * The most common applications of the Proxy pattern are lazy loading, caching, controlling the access, logging, etc. 
		 * A Proxy can perform one of these things and then, depending on the result, pass the execution to the same method in a linked RealService object.
		 */
		if (check_access()) {
			real_service.request();
			log_access();
		}
	}
}
