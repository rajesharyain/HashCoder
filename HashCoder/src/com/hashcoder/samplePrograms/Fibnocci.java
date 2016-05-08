package com.hashcoder.samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibnocci {

	public Fibnocci() {
		// TODO Auto-generated constructor stub
	}

	public int fib(int n){
		if(n <= 1) //Base Condition
			return 1;
		else { //Recursive case
			return fib(n-1) + fib(n-2);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibnocci fib = new Fibnocci();
		//System.out.println(fib.fib(7));
		
		
		List<String> list1 =  new ArrayList<>();
		List<String> list2 =  new ArrayList<>();
		list1.add("Ravi");
		list1.add("Rajesh");
		list1.add("Abhay");
		list1.add("Baban");
		
		list2.add("Akela");
		list2.add("Tushar");
		list2.add("Ravi");
		list2.add("Abhay");
		list2.add("123");
		list2.add("456");
		list2.add("789");
		
		
		if(list2.retainAll(list1))
		{
			Iterator<String> it = list2.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

	}

}
