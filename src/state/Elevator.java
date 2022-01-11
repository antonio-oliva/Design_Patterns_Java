package state;

public class Elevator {
	/*
	 * The Elevator class is the context. It should be initiated with a default
	 * state.
	 */

	State _state;

	public Elevator(State state) {
		this.setElevator(state);
	}

	public void setElevator(State state) {
		/*
		 * Method to change the state of the object
		 */
		this._state = state;
		this._state._elevator = this;
	}

	public void presentState() {
		System.out.println("Elevator is in " + this._state.getClass().getName().substring(6) + "\n");
	}

	// The methods for executing the elevator functionality.
	// These depends on the current state of the object.
	public void pushDownButton() {
		this._state.pushDownButton();
	}

	public void pushUpButton() {
		this._state.pushUpButton();
	}
}
