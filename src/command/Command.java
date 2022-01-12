package command;

public abstract class Command {
	/*
	 * COMMAND INTERFACE
	 * The switch interface, that all commands will implement
	 */
	
	int _backup;
	Light _light;
	
	public Command(Light light) {
		this._light = light;
	}
	
	public void backup() {
		this._backup = this._light.state;
	}
	
	public void undo() {
		this._light.state = this._backup;
	}
	
	public abstract void execute();
}
