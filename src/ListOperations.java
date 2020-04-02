import java.util.Set;
import java.util.*;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> setList = new ArrayList<Integer>();

		setList.add(1);
		setList.add(3);
		setList.add(8);
		setList.add(9);
		setList.add(11);
		List<Integer> setListNew = new ArrayList<Integer>();

		System.out.println(setList);
		
		for (int i = 0; i < setList.size(); i++) {
			if (setList.get(i) > 5) {
				setListNew.add(setList.get(i));
			}
		}
		
		System.out.println(setListNew);
	}
}
