package facade;

public class Facade {
	private Subsystem1 subsystem1 = new Subsystem1();
	private Subsystem2 subsystem2 = new Subsystem2();
	
	public Facade(){}
	
	public Facade(Subsystem1 subsystem1, Subsystem2 subsystem2) {
		this.subsystem1 = subsystem1;
		this.subsystem2 = subsystem2;
	}
	
	public void operations() {
		System.out.println("Facade initializes subsystems:");
		this.subsystem1.operation1();
		this.subsystem2.operation1();
		System.out.println("Facade orders subsystems to perform the action:");
		this.subsystem1.operationN();
		this.subsystem2.operationN();
		System.out.println("Facade has ended!");
	}
}