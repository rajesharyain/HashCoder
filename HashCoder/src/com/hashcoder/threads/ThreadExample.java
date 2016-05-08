package com.hashcoder.threads;

public class ThreadExample extends Thread{

	ThreadExample(){
		// TODO Auto-generated constructor stub
		super("My Thread");
		start();
		
	}
	public void run()
	{
		System.out.println(this);
		//System.out.println("Child Thread");
	}

	

}
class multithreaded_programming
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ThreadExample();
		int a =5;
		int b = 4;
		a = a+b; //9
		b= a-b; //5
		a= a-b;//4
		
		
		// TODO Auto-generated method stub
		//ThreadExample t = new ThreadExample();
		//t.start();
		//System.out.println("Main Thread");
	}	
	
	
}