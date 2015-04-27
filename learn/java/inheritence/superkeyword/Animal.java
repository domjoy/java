package learn.java.inheritence.superkeyword;

public class Animal {
	String Type = "Not Human";
	public String Lives = "On Land";

	public Animal() {
		this.Type = "Not Human";
		System.out.println();
	}

	public Animal(String x) {
		Type = x;
		// this.Type = x;
		System.out.println();
	}
}
