
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "malayalam";
		int count = 0;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'a') {
				count = count + 1;
			}
		}
		System.out.println(count);

	}

}
