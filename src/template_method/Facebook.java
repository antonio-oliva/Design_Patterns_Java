package template_method;

/**
 * Class of social network
 */
public class Facebook extends Network {
	public Facebook(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public boolean logIn() {
		System.out.println("\nChecking user's parameters");
		System.out.println("Name: " + this.username);
		System.out.print("Password: ");
		for (int i = 0; i < this.password.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n\nLogIn success on Facebook");
		return true;
	}
	
	public boolean sendData(byte[] data) {
		boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }
	
	public void logOut() {
		System.out.println("User: '" + this.username + "' was logged out from Facebook");
	}
}
