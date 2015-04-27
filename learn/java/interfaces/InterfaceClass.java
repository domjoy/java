package learn.java.interfaces;

public interface InterfaceClass {
	// int c;
	int d = 2;

	int add(int x, int y);

	void print(int sum);
	
	//void test(int a) {}
}

/*
 * Note that Interface Classes should not be considered Abstract Parent classes,
 * just because implementation classes can have many interface implementations.
 * Similarly implementation classes are not children classes. This relationship
 * of child/parent only is accurate in class extensions.
 * 
 * Parent = Superclass
 * Child = Subclass
 * However, these are not concepts in interfaces, but only in extensions.
 * 
 * QUESTION: Can an interface contain implementation methods? ANSWER: Well, try
 * it out!
 * 
 * QUESTION: Can an interface contain variables? ANSWER: Well, try it out!
 */