package observer;

import java.io.File;

public class Editor {

	public Publisher publisher;
	private File file;

	public Editor() {
		this.publisher = new Publisher(new String[] { "open", "save" });
	}

	public void openFile(String filePath) {
		this.file = new File(filePath);
		this.publisher.notify("open", file);
	}

	public void saveFile() throws Exception {
		if (this.file != null) {
			this.publisher.notify("save", file);
		} else {
			throw new Exception("Please first open a file!");
		}
	}
}
