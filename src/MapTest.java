import java.util.ArrayList;
import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Address> addresses = new ArrayList<>();
		
		Address address = new Address();
		address.setShopName("Tata 1");
		address.setLane("5th Main");
		address.setArea("sector 1");
		address.setCity("Noida");
		address.setCountry("India");
		address.setPincode("438479");
		
		Map<String,Map<String,List<Address>>> countryCityAddressMap = null;
		Map<String,List<Address>> cityAddressmap = null;
		List<Address> addList = null;
		if (null!=addresses && !addresses.isEmpty()) {
			countryCityAddressMap = new HashMap<>();
			for(Address addressObj : addresses) {
			    if (null != countryCityAddressMap.get(addressObj.getCountry())) {
			    	addList = new ArrayList<>();
			        addList.add(addressObj);
			        
			    }
			}
		}
	}

}
