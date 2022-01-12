package observer;

import java.io.File;

public class EmailNotificationObserver implements Observer {
	private String email;

	public EmailNotificationObserver(String email) {
		this.email = email;
	}

	@Override
	public void update(String eventType, File file) {
		System.out.println("Email to " + email + ": Someone has performed " + eventType
				+ " operation with the following file: " + file.getName());
	}
}
