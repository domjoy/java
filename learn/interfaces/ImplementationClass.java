package learn.interfaces;

public class ImplementationClass implements InterfaceClass, InterfaceClass2 {
	@Override
	public int add(int x, int y) {
		// d += 2;
		// System.out.println(d);
		return (x + y);
	}

	@Override
	public void print(int sum) {
		System.out.println(sum);
	}

	@Override
	public int add(int x, Double y) {
		return 0;
	}
}

/*
 * TRICK QUESTION: What happens if we have the same abstract method in multiple
 * interfaces? ANSWER: Why do you think anything should happen? :) Everything
 * happens only in an implementation class. You're good as long as all abstract
 * methods are implemented.
 * 
 * QUESTION: How are the constants of an interface used in the implementation
 * class? ANSWER: Well, try it out! (constants from an interface that are used
 * in implementation classes are 'static' and 'final' in nature.
 */