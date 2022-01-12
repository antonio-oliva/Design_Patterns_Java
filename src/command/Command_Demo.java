package command;

public class Command_Demo {

	public static void main(String[] args) {
		// Create the Receiver (a Light)
		Light light = new Light();
		
		// Create Commands
		Command switchOn = new SwitchOnCommand(light);
		Command switchOff = new SwitchOffCommand(light);
		
		// Create the Invoker (a Switch) and register Commands
		Switch mySwitch = new Switch();
		mySwitch.registerCommand("on", switchOn);
		mySwitch.registerCommand("off", switchOff);
		
		// Execute the commands
	    light.showState();
	    mySwitch.executeCommand("on");
	    light.showState();
	    mySwitch.executeCommand("off");
	    light.showState();
	    mySwitch.undo();
	    light.showState();
	    mySwitch.undo();
	    light.showState();
	    mySwitch.undo();
	    light.showState();
	}

}
