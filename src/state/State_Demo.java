package state;

public class State_Demo {

	public static void main(String[] args) {
		// The client code
		Elevator myElevator = new Elevator(new FirstFloor(null));
		myElevator.presentState();

		// Up button is pushed twice
		myElevator.pushUpButton();
		myElevator.pushUpButton();
		myElevator.presentState();

		// Down button is pushed
		myElevator.pushDownButton();
		myElevator.presentState();

	}

}
