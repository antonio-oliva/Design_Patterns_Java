package command;

public class SwitchOffCommand extends Command {
    /*
    * SWITCH OFF COMMAND
    * A Command object, that implements the Command interface and runs the command on the designated Receiver
    */

	public SwitchOffCommand(Light light) {
		super(light);
	}

	@Override
	public void execute() {
		this.backup();
		System.out.println("Turning light off...");
		this._light.turnOff();
	}

}
