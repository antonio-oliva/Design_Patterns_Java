package state;

public class FirstFloor extends State {

	FirstFloor(Elevator elevator) {
		super(elevator);
	}

	@Override
	public void pushDownButton() {
		/*
		 * If the down button is pushed when it is already on the first floor, nothing
		 * should happen
		 */
		System.out.println("Already in the bottom floor!");

	}

	@Override
	public void pushUpButton() {
		/*
		 * If up button is pushed, move upwards then it changes its state to second
		 * floor.
		 */
		System.out.println("Elevator moving upward one floor...");
		this._elevator.setElevator(new SecondFloor(this._elevator));

	}
}
