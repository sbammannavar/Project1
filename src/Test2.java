import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 12;
		int c = a + b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c:" + c);

		calendar();

	}

	private static void calendar() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.YEAR));

		cal.add(Calendar.DATE, 5);

		System.out.println(cal.getTime());
	}

}
