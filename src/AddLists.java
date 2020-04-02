import java.util.*;

public class AddLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> setNumAll = new TreeSet<Integer>();

		Set<Integer> setNumOdd = new TreeSet<Integer>();

		setNumOdd.add(1);
		setNumOdd.add(15);
		setNumOdd.add(5);
		setNumOdd.add(17);
		setNumOdd.add(9);

		Set<Integer> setNumEven = new TreeSet<Integer>();

		setNumEven.add(2);
		setNumEven.add(4);
		setNumEven.add(16);
		setNumEven.add(8);
		setNumEven.add(20);

		setNumOdd.addAll(setNumEven);

		setNumAll = setNumOdd;

		System.out.println(setNumAll);
	}

}
