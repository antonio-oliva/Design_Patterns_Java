package decorator;

public class SmsDecorator extends Decorator {
    /*
    * Concrete Decorator(s) (like SmsDecoretor and FacebookDecoretor) call the wrapped object and alter its result.
    */
	
	public SmsDecorator(Notifier notifier){
		super(notifier);
	}
	
	@Override
	public String send() {
        /*
        * Decorators may call parent implementation of the operation, instead of calling the wrapped object directly.
        * This approach simplifies extension of decorator classes.
        */
		return this.getNotifier().send().toString() +
				"\n SMS Decorator: sending SMS notification.";
	}
}
