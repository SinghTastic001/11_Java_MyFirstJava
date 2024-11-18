package CollectionFramework.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("1", "Shubhi");
		map.put("2", "Singh");
		System.out.println(map);
		
		System.out.println(map.get("2"));
		
		map.replace("1","Shubhi","SINGHHHHH");
		System.out.println(map);
		
		map.remove("1");
		System.out.println(map);
		
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}

}
