package decorator;

public class FacebookDecorator extends Decorator {
    /*
    * Decorators can execute their behavior either before or after the call to a wrapped object.
    */
	
	public FacebookDecorator(Notifier notifier){
		super(notifier);
	}
	
	@Override
	public String send() {
		return this.getNotifier().send().toString() +
				"\n Facebook Decorator: sending Facebook notification.";
	}
}
