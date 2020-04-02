import java.util.Set;
import java.util.*;

public class listIterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;

		List<Integer> setList = new ArrayList<Integer>();

		setList.add(1);
		setList.add(15);
		setList.add(5);
		setList.add(17);
		setList.add(19);

		System.out.println(setList);

		Iterator it = setList.iterator();

		while (it.hasNext()) {

			num1 = (Integer) it.next();

			if (num1 < 10) {
				it.remove();
			}
		}

		System.out.println(setList);
	}
}
