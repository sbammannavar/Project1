import java.util.ArrayList;
import java.util.*;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeName = new ArrayList<String>();

		employeeName.add("Santosh1");
		employeeName.add("Santosh2");
		employeeName.add("Santosh3");
		employeeName.add("123");

		employeeName.remove("123");

		System.out.println(employeeName);

		Map<String, String> mapArray = new HashMap<String, String>();
		mapArray.put("15", "Santosh");
		mapArray.put("157", "Anand");
		/*
		 * mapArray=null; mapArray.size();
		 */
		System.out.println(mapArray);
	}

}
