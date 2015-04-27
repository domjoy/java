package learn.inheritence.superkeyword;

public class Aquatic extends Animal {
	String Type = "SPECIAL";
	final String Lives = "In Water";

	public Aquatic() {
		Type = "swimming creatures";
	}

	public Aquatic(String x) {
		// super();
		super(x);
		System.out.println();
	}
	// public test(){
	// super();
	// }

}
