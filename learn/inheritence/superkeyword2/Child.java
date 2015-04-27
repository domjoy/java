package learn.inheritence.superkeyword2;

public class Child extends Parent {
	void display() {
		System.out
				.println("Now in Child Class calling display() by using super");
		super.display();
	}
}

/*
 * Unlike super() constructor call which should be positioned as the first entry
 * in the child constructor, super.<method> or super.<variable> can be accessed
 * from anywhere in the child
 */