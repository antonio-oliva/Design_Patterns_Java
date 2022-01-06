package composite;

import java.util.ArrayList;

public class Box implements Component{
	private double _price;
	private ArrayList<Component> _components = new ArrayList<Component>();
	
	public Box(double price) {
		this._price = price;
	}
	
	public void add(Component component) {
		this._components.add(component);
	}
	
	public void remove(Component component) {
		this._components.remove(component);
	}
	
	public double price() {
		double totalPrice = this._price;
		for(Component c: this._components) {
			totalPrice += c.price();
		}
		return totalPrice;
	}
	
}
