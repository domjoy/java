package learn.java.constructor.overloading;

public class Overloading {
	int x, y;// Default values for int is zero

	public Overloading() {
		// Do Nothing - see what happens!
	}

	public Overloading(int z) {
		this.x = this.y = z;
	}

	public Overloading(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Overloading oe = new Overloading();
		System.out.println(oe.x + " " + oe.y);
		Overloading oe1 = new Overloading(7);
		System.out.println(oe1.x + " " + oe1.y);
		Overloading oe2 = new Overloading(5, 5);
		System.out.println(oe2.x + " " + oe2.y);
	}
}