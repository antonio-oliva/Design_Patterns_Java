package proxy;

public class Proxy_Demo {
	private static void client_code(Service service) {
		/*
		 * The client code is supposed to work with all objects (both real services and proxies) via the Service interface 
		 * in order to support both real services and proxies.
		 */
		service.request();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Client: Executing the client code with a real service:");
	    RealService real_service = new RealService();
	    client_code(real_service);

	    System.out.println("");

	    System.out.println("Client: Executing the same client code with a proxy:");
	    Proxy proxy = new Proxy(real_service);
	    client_code(proxy);
	}
}
