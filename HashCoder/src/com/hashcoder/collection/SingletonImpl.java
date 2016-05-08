package com.hashcoder.collection;

public class SingletonImpl {

	public SingletonImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton one = Singleton.getInstance();
		
		one.display("raj");
		
		Singleton two = Singleton.getInstance();
		two.display("Ravi");
	}

}
