package observer;

public class Observer_Demo {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.publisher.subscribe("open", new LogObserver("/path/to/log/file.txt"));
		editor.publisher.subscribe("save", new EmailNotificationObserver("admin@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
