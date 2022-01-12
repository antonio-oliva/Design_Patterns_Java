package command;

public class Light {
	/*
	 * RECEIVER
	 * Implements the methods called by Commands through the execute()
	 */
	
	int state = 0;
	
	public void turnOn() {
		this.state = 1;
	}
		
	public void turnOff() {
		this.state = 0;
	}
	
	public void showState() {
		if (this.state == 1) {
			System.out.println("Light is ON");
		}else{
			System.out.println("Light is OFF");
		}
	}
}
