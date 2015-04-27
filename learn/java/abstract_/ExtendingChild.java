package learn.java.abstract_;

public class ExtendingChild extends AbstractParent {
	@Override
	// Are optional, but good programming standard
	void Area() {
		System.out.println("Finding the Area");
	}

	@Override
	void fun2() {
		System.out.println("In a class that extends abtract class");
	}
}
/*
 * However, a given child class can extend (or inherit) only one class. Try your
 * luck at extending more than one class here and see what happens.
 * 
 * QUESTION: How do we satisfy the need of using methods from multiple classes?
 * ANSWER: By using interfaces, since we can implement multiple interface
 * classes separated by commas. We will visit this concept later.
 * 
 * BONUS QUESTION: Can you extend a non-abstract class? ANSWER: Well, try it
 * out! (Yes)
 */
