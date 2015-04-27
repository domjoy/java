package learn.java.inheritence.overriding2;

public class Aquatic extends Animal {
	@Override
	int fun(int a, int b) {
		System.out.println("Sum By super class : " + super.fun(a, b));
		int c = a * b;
		return c;
	}

	@Override
	double fun(double a, double b, double c) {
		System.out.println("Sum By super class : " + super.fun(a, b, c));
		double mul = a * b * c;
		return mul;
	}
}