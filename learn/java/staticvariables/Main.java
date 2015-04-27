package learn.java.staticvariables;

public class Main {
	static int count = 10;

	public static void main(String args[]) {
		// directly
		System.out.println(count);
		// via object
		Main ob = new Main();
		System.out.println(ob.count);
		// via class
		System.out.println(Main.count);
		StaticVariables ob2 = new StaticVariables();
		ob2.fun();
	}
}