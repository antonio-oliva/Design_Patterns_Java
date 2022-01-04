package factory_method;

public class factoryWindowsDialog extends factoryDialog {
	 @Override
	    public Button createButton() {
	        return new WindowsButton();
	    }
}
