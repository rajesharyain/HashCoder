package com.hashcoder.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapHashtable {

	public HashMapHashtable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hMap = new HashMap<String,String>();
		Map<String,String> hTable = new Hashtable<String,String>();
		
		hMap.put(null, "1");
		hMap.put(null, "2");
		
		hTable.put(null, "Ravi");
		hTable.put(null, "Rajesh");
		
	}

}
