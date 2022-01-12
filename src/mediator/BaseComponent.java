package mediator;

public class BaseComponent {
	
	MediatorInterface _mediator;
	
	public BaseComponent() {}
	
	public BaseComponent(MediatorInterface mediator) {
		this._mediator = mediator;
	}

	public MediatorInterface get_mediator() {
		return _mediator;
	}

	public void set_mediator(MediatorInterface _mediator) {
		this._mediator = _mediator;
	}
	
	
}
