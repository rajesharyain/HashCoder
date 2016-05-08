package com.hashcoder.samplePrograms;

/**
 * We know that Map contains key-value pairs, whereas a list contains only objects. Since Entry class contains both key-value pair, Entry class will helps us to convert from Map (HashMap) to List (ArrayList). By using Map.entrySet() you will get Set object, which intern you can use it to convert to list object. - See more at: http://www.java2novice.com/java_interview_questions/convert-map-to-list/#sthash.kyYnW9Rz.dpuf
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToList {

	public ConvertMapToList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> wordMap = new HashMap<String, String>(); 
		wordMap.put("Zbhay", "Tripathi");
		wordMap.put("Rajesh", "Kumar");
		wordMap.put("Rbhay", "Tripathi");
		wordMap.put("Sbhay", "Tripathi");
		wordMap.put("Bbhay", "Tripathi");
		wordMap.put("Kbhay", "Tripathi");
		wordMap.put("ZZhay", "Tripathi");
		wordMap.put("hay", "Tripathi");
		
		Set<Entry<String, String>> set = wordMap.entrySet(); 
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(set); 
		
		Iterator<Entry<String, String>> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println("List Entry : " + iter.next());
		}
		
		//- See more at: http://www.java2novice.com/java_interview_questions/convert-map-to-list/#sthash.Vwzf8DVU.dpuf
	}

}
