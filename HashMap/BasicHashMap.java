package com.as.collection.HashMap;

import java.util.HashMap;

public class BasicHashMap {

	public static void main(String[] args) {
		
		HashMap< String, String> hm = new HashMap<String, String>();
		
		hm.put("first", "Welcoime to first Value");
		hm.put("second", "welcome to second value");
		hm.put("third", "welcome to third value");
		
		System.out.println(hm);
		//get value 
		System.out.println("First Value = "+hm.get("first"));
		
		//remove the value
		hm.remove("third");
	}
}
