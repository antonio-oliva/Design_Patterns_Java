package decorator;

public class ConcreteNotifier implements Notifier{
	public String send() {
		return "Concrete Notifier: sending popup notification.";
	}
}
