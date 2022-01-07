package decorator;

public class SmsDecorator extends Decorator {
	
	public SmsDecorator(Notifier notifier){
		super(notifier);
	}
	
	@Override
	public String send() {
		return this.getNotifier().send().toString() +
				"\n SMS Decorator: sending SMS notification.";
	}
}
