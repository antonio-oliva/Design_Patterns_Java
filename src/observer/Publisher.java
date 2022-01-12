package observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Publisher {
	HashMap<String, ArrayList<Observer>> observers = new HashMap<String, ArrayList<Observer>>();

	public Publisher(String[] operations) {
		for (String operation : operations) {
			this.observers.put(operation, new ArrayList<Observer>());
		}
	}

	public void subscribe(String eventType, Observer observer) {
		ArrayList<Observer> users = observers.get(eventType);
		users.add(observer);
	}

	public void unsubscribe(String eventType, Observer observer) {
		ArrayList<Observer> users = observers.get(eventType);
		users.remove(observer);
	}

	public void notify(String eventType, File file) {
		ArrayList<Observer> users = observers.get(eventType);
		for (Observer observer : users) {
			observer.update(eventType, file);
		}
	}
}
