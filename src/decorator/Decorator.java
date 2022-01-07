package decorator;

public class Decorator implements Notifier{
    /*
    * The base Decorator class follows the same interface as the other components.
    * The primary purpose of this class is to define the wrapping interface for all concrete decorators.
    * The default implementation of the wrapping code might include a field for storing a wrapped component and the means to initialize it.
    */
	private Notifier _notifier;
	
	public Decorator() {}
	
	public Decorator(Notifier notifier) {
		this._notifier = notifier;
	}
	
	public Notifier getNotifier() {
        /*
        * The Decorator delegates all work to the wrapped component.
        */
		return this._notifier;
	}
	
	public String send() {
		return this.getNotifier().send();
	}
}
