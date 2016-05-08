package com.hashcoder.collection;


public class Singleton {

	private static Singleton instancec= null;//new Singleton();
	//private static final Singleton instancec= new Singleton(); 
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		synchronized(Singleton.class)
		{
			if(instancec==null)
			{
				instancec = new Singleton();
			}
			else
			{
				System.out.println("Instance already created!");
			}
		}
		 return instancec;
		
	}
	
	public void display(String s)
	{
		System.out.println("Display String: "+s);
	}

}

