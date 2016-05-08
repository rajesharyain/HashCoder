package com.hashcoder.samplePrograms;

public class StringAndStringBuffer {

	public StringAndStringBuffer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Immutable = Non changable object
		String s = new String("Ravi");
		s.concat(" Arya");
		System.out.println("Immutable String : "+s);
		
		//Mutable - Object can be modified
		StringBuffer sb = new StringBuffer("Rajesh");
		sb.append(" Arya");
		System.out.println("mmutable StringBuffer thread safe: "+sb);
		
		//String Builder
		StringBuilder sbuild = new StringBuilder("Hello");
		sbuild.append(" World!");
		System.out.println("mmutable StringBuilder but not a Thread safe : "+sbuild);
		
	}

}
