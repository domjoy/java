package learn.staticvariables;

public class StaticVariables {
	void fun() {
		Main ob = new Main();
		System.out.println(ob.count);
		System.out.println(Main.count);
	}

}
