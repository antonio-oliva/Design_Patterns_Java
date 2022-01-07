package decorator;

public class ConcreteNotifier implements Notifier{
    /*
    * Concrete Notifier(s) provide default implementations of the operations.
    * There might be several variations of these classes.
    */
	public String send() {
		return "Concrete Notifier: sending popup notification.";
	}
}
