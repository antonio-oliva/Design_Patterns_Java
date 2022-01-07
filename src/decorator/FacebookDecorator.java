package decorator;

public class FacebookDecorator extends Decorator {
	
	public FacebookDecorator(Notifier notifier){
		super(notifier);
	}
	
	@Override
	public String send() {
		return this.getNotifier().send().toString() +
				"\n Facebook Decorator: sending Facebook notification.";
	}
}
