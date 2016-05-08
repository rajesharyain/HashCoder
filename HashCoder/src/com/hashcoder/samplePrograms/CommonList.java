package com.hashcoder.samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonList {

	public CommonList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(1);
		l1.add(2);
		l1.add(3);

		List<Integer> l2= new ArrayList<Integer>();
		l2.add(4);
		l2.add(2);
		l2.add(3);

		List<Integer> l3 = new ArrayList<Integer>(l2);
		l3.retainAll(l1);
		
		Iterator<Integer> it = l3.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
