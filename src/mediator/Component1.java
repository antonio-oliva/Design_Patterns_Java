package mediator;

public class Component1 extends BaseComponent {
	
	public Component1() {
		super();
	}

	public Component1(MediatorInterface mediator) {
		super(mediator);
	}

	public void do_a() {
		System.out.println("Component 1 does A.");
		this.get_mediator().notify(this, "A");
	}

	public void do_b() {
		System.out.println("Component 1 does B.");
		this.get_mediator().notify(this, "B");
	}
}
