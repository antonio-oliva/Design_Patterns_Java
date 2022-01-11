package state;

public class SecondFloor extends State {

	SecondFloor(Elevator elevator) {
		super(elevator);
	}

	@Override
	public void pushDownButton() {
		/*
		 * If down button is pushed it should move one floor down
		 */
		System.out.println("Elevator moving down a floor...");
		this._elevator.setElevator(new FirstFloor(this._elevator));

	}

	@Override
	public void pushUpButton() {
		/*
		 * If up button is pushed, move upwards then it changes its state to second
		 * floor.
		 */
		System.out.println("Elevator moving upward one floor...");
		this._elevator.setElevator(new ThirdFloor(this._elevator));

	}
}
