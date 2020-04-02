
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Userdefinedclass obj = new Userdefinedclass();
		obj.a = 10;

		obj.arithexp1();

	}
}

class Userdefinedclass extends Exception {

	int a;
	int b;

	public void arithexp1() {
		try {
			int b = a / 0;
			System.out.println("inside try block");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Bye Bye");
		}
	}
}
