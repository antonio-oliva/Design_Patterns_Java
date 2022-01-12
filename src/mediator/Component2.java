package mediator;

public class Component2 extends BaseComponent {
	
	public Component2() {
		super();
	}

	public Component2(MediatorInterface mediator) {
		super(mediator);
	}

	public void do_c() {
		System.out.println("Component 2 does C.");
		this.get_mediator().notify(this, "C");
	}

	public void do_d() {
		System.out.println("Component 2 does D.");
		this.get_mediator().notify(this, "D");
	}
}
