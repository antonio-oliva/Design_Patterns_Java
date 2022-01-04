package singleton;

public final class Singleton {
	private static Singleton _instance;
		
	public static Singleton getInstance() {
		if (_instance == null) {
			_instance = new Singleton();
		}
		return _instance;
	}
	
}
