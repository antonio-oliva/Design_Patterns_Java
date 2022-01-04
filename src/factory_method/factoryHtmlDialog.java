package factory_method;

public class factoryHtmlDialog extends factoryDialog {
	@Override
    public Button createButton() {
        return new HtmlButton();
    }
}
