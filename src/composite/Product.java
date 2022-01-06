package composite;

public class Product implements Component {
	
	private double _price;
	
	public Product(double price) {
		this._price = price;
	}
	
	public double price() {
		return this._price;
	}

}
