package template_method;

/**
 * Base class of social network.
 */
public abstract class Network {
	String username;
	String password;
	
	public Network() {}
	
	/**
     * Publish the data to whatever network.
     */
	public boolean post(String message) {
		// Authenticate before posting. Every network uses a different
        // authentication method.
		if (logIn()) {
			// Send the post data.
			boolean result = sendData(message.getBytes());
			logOut();
			return result;
		}
		return false;
	}
	
	public abstract boolean logIn();
	public abstract boolean sendData(byte[] data);
	public abstract void logOut();
}
