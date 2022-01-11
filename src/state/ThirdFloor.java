package state;

public class ThirdFloor extends State {

	ThirdFloor(Elevator elevator) {
		super(elevator);
	}

	@Override
	public void pushDownButton() {
		/*
		 * If down button is pushed it should move one floor down
		 */
		System.out.println("Elevator moving down a floor...");
		this._elevator.setElevator(new SecondFloor(this._elevator));

	}

	@Override
	public void pushUpButton() {
		/*
		 * If up button is pushed nothing should happen
		 */
		System.out.println("Already in the top floor!");

	}
}
