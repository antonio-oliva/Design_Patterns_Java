package command;

import java.util.ArrayList;
import java.util.HashMap;

public class Switch {
	
	HashMap<String, Command> _commands = new HashMap<String, Command>();
	ArrayList<Command> _history = new ArrayList<Command>();
	
	public void showHistory() {
		/*
		 * Print the command history
		 */
		for(int i=0; i<this._history.size(); i++) {
			System.out.println(i + ":\t" + this._history.get(i));
		}
	}
	
	public void registerCommand(String commandName, Command command) {
		this._commands.put(commandName, command);
	}
	
	public void executeCommand(String commandName) {
		if(this._commands.containsKey(commandName)){
			this._commands.get(commandName).execute();
			this._history.add(this._commands.get(commandName));
		}else{
			System.out.println("Command [" + commandName + "] not recognised");
		}
	}
	
	public void undo() {
		if(this._history.size() > 0) {
			System.out.println("Undoing last command...");
			Command lastCommand = this._history.get(this._history.size()-1);
			lastCommand.undo();
			this._history.remove(this._history.size()-1);
		}else {
			System.out.println("No commands to undo!");
		}
	}

}
