package learn.java.inheritence.superkeyword;

public class Main {
	public static void main(String[] args) {
		Aquatic ob = new Aquatic();
		System.out.println("Aquatic animals are " + ob.Type + " and live "
				+ ob.Lives);
		Aquatic ob1 = new Aquatic("Swimmers");
		System.out.println("Aquatic animals are " + ob1.Type + " and live "
				+ ob1.Lives);
	}
}

/*
 * 1. The printlns are so you may notice the flow of control while stepping
 * though in debug mode.
 * 
 * 2. Try one debug execution with and one without the super() call. Make sure
 * you add an additional breakpoint when using it.
 * 
 * 3. Try both the supers and understand the flow of control.
 * 
 * QUESTION: What is the use of the super() call? ANSWER: To run through the
 * constructor from the parent class before doing anything more in the child.
 * 
 * QUESTION: Can you call different supers one after the other? ANSWER: Well,
 * check it out! (You can call super only as the first statement. So multiple
 * supers would cause this requirement to fail.)
 * 
 * QUESTION: Can the super() be called from a method? ANSWER: Well, check it
 * out!
 * 
 * QUESTION: Why didn't "Swimmers" come in the output? ANSWER: Because it was
 * set only in the Animal class, while ob1 is object of type Aquatic. Try
 * setting the value in Aquatic class to see what happens. TRICK QUESTION: Does
 * this.Type in Animal allow it? ANSWER: Why would it? this is a way to set
 * class variables instead of same-name parameters in some cases.
 */