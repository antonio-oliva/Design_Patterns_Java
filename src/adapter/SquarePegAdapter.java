package adapter;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
	private SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}
	
	@Override
	public double getRadius() {
		// Calculate a minimum circle radius, which can fit this peg.
		return this.peg.getWidth()*Math.sqrt(2)/2.0;
	}
}
