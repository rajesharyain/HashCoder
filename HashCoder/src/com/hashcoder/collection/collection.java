package com.hashcoder.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class collection {

	public collection() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.add(new Integer(9));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(4));
		
		Iterator i = list.iterator();
		Collections.reverse(list);
		Collections.sort(list);
		
		while(i.hasNext())
		{
			System.out.println(i.next() + " ");
		}

	}

}
