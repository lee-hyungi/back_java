package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "lhg");
		userMap.put("password", "123");
		userMap.put("name", "이현기");
		userMap.put("age", "32");
		userMap.put("usRich", true);
		
		System.out.println(userMap);
		System.out.println(userMap.get("age"));
		System.out.println(userMap.entrySet());
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
