package learn.java.constructor.overloading;

public class Constructors {
	int x;
	int y;

	public Constructors() {
		x = 10;
		y = 11;
	}

	public Constructors(int z) {
		x = z;
		y = z;
	}
	
	public static void main(String[] args) {
		Constructors ob = new Constructors();
		System.out.println("Value of x when constructor is called: " + ob.x);
		System.out.println("Value of y when constructor is called: " + ob.y);
		Constructors ob_1 = new Constructors(5);
		System.out.println("Value of x when constructor is called: " + ob_1.x);
		System.out.println("Value of y when constructor is called: " + ob_1.y);
	}
}