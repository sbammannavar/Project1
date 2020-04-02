
class AbstractDemo {
	public static void main(String args[]) {

		// Uncommenting the following line will cause compiler error as the
		// line tries to create an instance of abstract class.
		// Base b = new Base();

		// We can have references of Base type.
		//AbstractDemo obj = new AbstractDemo();
		//obj.fun();
		Derived3 b = new Derived3();
		b.fun();
	}
}

abstract class Base3 {
	abstract void fun();
}

class Derived3 extends Base3 {
	void fun() {
		System.out.println("Derived fun() called");
	}
}