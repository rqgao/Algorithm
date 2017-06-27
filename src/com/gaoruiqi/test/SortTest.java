package com.gaoruiqi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class SortTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "1");
		hashMap.put("2", "1");
		hashMap.put("3", "1");
		Set<Map.Entry<String, String>> entry = hashMap.entrySet();
		Iterator iterator = entry.iterator();
		while(iterator.hasNext()){
			Map.Entry e = (Map.Entry) iterator.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
