package command;

public class SwitchOnCommand extends Command {
    /*
    * SWITCH ON COMMAND
    * A Command object, that implements the Command interface and runs the command on the designated Receiver
    */

	public SwitchOnCommand(Light light) {
		super(light);
	}

	@Override
	public void execute() {
		this.backup();
		System.out.println("Turning light on...");
		this._light.turnOn();
	}

}
