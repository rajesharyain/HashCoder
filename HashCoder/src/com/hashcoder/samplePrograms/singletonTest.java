/**
	 * 1) clone() --> method is used to make a copy of object
	2) for that we need to implement the clonable interface for that class
	and override clone() method of Object class.
	
	3) in Singleton --> To break singleton any one can clone the object.
	
	but why we use clone() method overriding in singleton and implement clonable interface to prevent cloning .
	
	just override the clone method in singlton class and throe the exception like cloneNotSupportedException
	
	**/

package com.hashcoder.samplePrograms;

import java.util.ArrayList;
import java.util.List;

public class singletonTest
{
	public void singletonTest()	{	}
	
	public static void main(String[] args) {
		singleton single = singleton.getInstance();
		try
		{	
			singleton cloningOfSingltonObject = (singleton) single.clone();
			System.out.println("Cloning not allowed!");
		}
		catch(Exception ex)
		{
			System.out.println("exception: "+ ex.getMessage());	
		}
	}
}

//Crete a singleton class which prfevents the cloning of an object.

class singleton implements Cloneable{
	private static singleton newInstance;
	private singleton() { }
	public static singleton getInstance()
	{
		synchronized (singleton.class) {
			newInstance = new singleton();
			return newInstance;
		}
	}
	//Overriding the clone method of Object class to throw CloneNotSupportException if someone try to invoke clone method on your singleton class.
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Cloning not allowed for Singleton class");
	}
}
