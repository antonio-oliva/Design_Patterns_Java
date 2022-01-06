package proxy;

public class RealService implements Service{
	/* 
	 * The RealService contains some core business logic. 
	 * Usually, RealService(s) are capable of doing some useful work which may also be very slow or sensitive - e.g. correcting input data. 
	 * A Proxy can solve these issues without any changes to the RealService's code. 
	 */
	public void request() {
		System.out.println("Real Service: handling request.");
	}
}
