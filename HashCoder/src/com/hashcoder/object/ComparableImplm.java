package com.hashcoder.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Fail Fast Exception
public class ComparableImplm {

	public ComparableImplm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a = "i am";
		String b = "i am";
		String c = "i am";
	
		// TODO Auto-generated method stub
		Employee e1 = new Employee(100,"Ravi", 1500, 22);
		Employee e2 = new Employee(99,"Sagar", 1000, 45);
		Employee e3 = new Employee(200,"tofek", 3000, 30);
		
		
		System.out.println("hash: "+a.hashCode());
		System.out.println("hash: "+b.hashCode());
		System.out.println("hash: "+c.hashCode());
		
		List list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		//int [] a = {2,1,4};
		Collections.sort(list);
		
		Iterator it = list.iterator();
		//Employee e4 = new Employee(4200,"tofek", 3000, 30);
		
		//list.add(e4);
		
		while(it.hasNext())
		{
			Employee e = (Employee) it.next();
			
			System.out.println("Id:"+ e.getId() +" Salary:"+ e.getSalary() +" "+ e.getName());
		}

		}
	
	

}
