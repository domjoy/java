package learn.java.inheritence.basic;

public class Main {
	public static void main(String[] args) {
		/*
		 * Try out the following instantiations one at a time and observe the
		 * behavior. It might really help if you guess the output before running
		 * the specific instantiation.
		 */
		// Aquatic ob = new Aquatic();
		// object and instantiation are of type Aquatic

		Animal ob = new Aquatic();
		// object is of type animal, but an Aquatic instantiation.

		// Aquatic ob = new Animal();
		// What went wrong here??

		System.out.println(ob.Type);
		System.out.println(ob.Lives);
		ob.fun();
	}
}

/*
 * 1. You cannot instantiate a super class and assign it to a child type object.
 * 
 * 2. Variables are available off the object type, whereas methods are available
 * off the instantiation type.
 * 
 * Yes, sometimes java is weird :)
 */
