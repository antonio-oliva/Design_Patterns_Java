package state;

public abstract class State {
	/*
	 * The common State interface for all the states
	 */

	Elevator _elevator;

	State(Elevator elevator) {
		this._elevator = elevator;
	}

	public abstract void pushDownButton();

	public abstract void pushUpButton();

}
