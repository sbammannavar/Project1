
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a = null;
			a.length();
		} catch (NullPointerException e) {
			System.out.println("Null pointer exeception occured");
		} finally {
			System.out.println("Program ends");
		}
	}

}
