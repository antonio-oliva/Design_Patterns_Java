package mediator;

public class Mediator implements MediatorInterface {

	Component1 _component1;
	Component2 _component2;

	public Mediator(Component1 component1, Component2 component2) {
		this._component1 = component1;
		this._component1.set_mediator(this);
		this._component2 = component2;
		this._component2.set_mediator(this);
	}

	@Override
	public void notify(BaseComponent sender, String event) {
		if (sender == this._component1 && event.equals("A")) {
			System.out.println("Mediator reacts on Component 1 action A and triggers following operations:");
			this._component2.do_c();
		} else if (sender == this._component2 && event.equals("D")) {
			System.out.println("Mediator reacts on Component 2 action D and triggers following operations:");
			this._component1.do_b();
			this._component2.do_c();
		}
		
	}

}
