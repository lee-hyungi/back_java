package jsonTest;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("street", "Victor Plains");
		hashMap.put("suite", "Suite 879");
		hashMap.put("city", "Wisokyburgh");
		hashMap.put("zipcode", "90566-7771");
		hashMap.put("lat", "-43.9509");
		hashMap.put("lng", "-34.4618");

		JSONObject json = new JSONObject(hashMap);
		System.out.println(json);
	}

}
