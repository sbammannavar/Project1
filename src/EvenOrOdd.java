import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = reader.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number " + num + " is a even number");
		} else {
			System.out.println("Number " + num + " is a odd number");
		}
	}

}
