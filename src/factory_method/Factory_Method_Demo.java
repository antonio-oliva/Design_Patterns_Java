package factory_method;

public class Factory_Method_Demo {
	public static void main(String[] args) {
		factoryDialog dialog;
		if (System.getProperty("os.name").equals("Windows 10")) {
	        dialog = new factoryWindowsDialog();
	    } else {
	    	dialog = new factoryHtmlDialog();
	    }
		
		dialog.renderWindow();
	}
}
