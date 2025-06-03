package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String,String> hm = new TreeMap<>();
		hm.put("One", "Monday");
		hm.put("Two", "Tuesday");
		hm.put("Three", "Wednesday");
		hm.put("Four", "Thursday");
		hm.put("Five", "Friday");
		hm.put("Six", "Saturday");
		hm.put("Seven", "Sunday");
		//hm.put("", "Monday");
		
		System.out.println(hm);
		
		System.out.println("Value:"+hm.get("Five"));
		
		/*System.out.println("Removing the Sunday:"+hm.remove(7));
		
		System.out.println("After removing Sunday:"+ hm);
		
		if(hm.containsValue("Sunday")) {
			System.out.println("Sunday is present in the HashMap hm");
		}else {
			System.out.println("Sunday is not present in the HashMap hm");
		}
		
		if(hm.containsKey(6)) {
			System.out.println("Key is present in hm HashMap");
		}else {
			System.out.println("Key is not present in hm HashMap");
		}
		
		System.out.println("Size of hashmap:"+hm.size());
		
		System.out.println("Empty hashmap:"+hm.isEmpty());
		
		System.out.println("Key Set:"+hm.keySet());
		
		System.out.println("Values:"+hm.values());
		
		System.out.println("Entry Set:"+hm.entrySet());*/
		
		
	}
}
