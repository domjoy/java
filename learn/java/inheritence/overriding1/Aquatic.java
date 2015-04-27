package learn.java.inheritence.overriding1;

public class Aquatic extends Animal {
	// static int a = 5;
	// static int b;
	@Override
	int fun(int a, int b) {
		System.out.println("Sum by super class: " + super.fun(a, b));
		a = 10;
		b = 20;
		int c = a * b;
		return c;
	}
}

/*
 * QUESTION: What do you think happens if you uncomment the static variables?
 * ANSWER: Are you expecting something to happen?
 * 
 * QUESTION, what if those variables had a value? ANSWER: Well, check it out!
 * (param variables in a method trump the class variables.)
 */