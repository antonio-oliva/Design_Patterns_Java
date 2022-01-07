package decorator;

public class Decorator implements Notifier{
	private Notifier _notifier;
	
	public Decorator() {}
	
	public Decorator(Notifier notifier) {
		this._notifier = notifier;
	}
	
	public Notifier getNotifier() {
		return this._notifier;
	}
	
	public String send() {
		return this.getNotifier().send();
	}
}
