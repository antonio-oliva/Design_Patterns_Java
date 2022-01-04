package singleton;

public class Singleton_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1.hashCode() == s2.hashCode()) {
			System.out.println("The Singleton implementation works.\n"
					+ "s1 and s2 have the same hashCode:\n"
					+ "s1:\t" + s1.hashCode() + "\n"
					+ "s2:\t" + s2.hashCode());
		}else{
			System.out.println("The Singleton implementation does not work.\n"
					+ "s1 and s2 have different hashCode(s):\n"
					+ "s1:\t" + s1.hashCode() + "\n"
					+ "s2:\t" + s2.hashCode());
		}
	}
}
