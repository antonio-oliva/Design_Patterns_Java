package observer;

import java.io.File;

public class LogObserver implements Observer {
	private File log;

	public LogObserver(String fileName) {
		this.log = new File(fileName);
	}

	@Override
	public void update(String eventType, File file) {
		System.out.println("Save to log " + log + ": Someone has performed " + eventType
				+ " operation with the following file: " + file.getName());
	}

}
