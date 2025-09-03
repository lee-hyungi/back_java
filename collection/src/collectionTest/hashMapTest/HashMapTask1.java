package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		ArrayList<String> datas = new ArrayList<String>();

		hashMap.put("street", "Victor Plains");
		hashMap.put("suite", "Suite 879");
		hashMap.put("city", "Wisokyburgh");
		hashMap.put("zipcode", "90566-7771");
		hashMap.put("lat", "-43.9509");
		hashMap.put("lng", "-34.4618");

//		1번째 방법
//		new ArrayList(hashMap.values());
		System.out.println(new ArrayList(hashMap.values()));

//		2번째 방법
//		Iterator<Entry<String, Object>> iterator = hashMap.entrySet().iterator();
//		ArrayList<Object> arrayList = new ArrayList<Object>();
//
//		while (iterator.hasNext()) {
//			arrayList.add(iterator.next().getValue());
//		}
//
//		System.out.println(arrayList);
	}
}
