package adapter;

/**
 * SquarePegs are not compatible with RoundHoles. But we have to integrate them into our program.
 */
public class SquarePeg {
	private double width;
	
	public SquarePeg(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
}
