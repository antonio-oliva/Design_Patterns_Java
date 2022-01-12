package mediator;

public interface MediatorInterface {
	/*
	 * The AbstractMediator interface declares a method used by components to notify
	 * the mediator about various events. The mediator may react to these events and
	 * pass the execution to other components.
	 */
	
	public void notify(BaseComponent sender, String event);
}
