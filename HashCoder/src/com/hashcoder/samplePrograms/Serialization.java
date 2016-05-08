package com.hashcoder.samplePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public Serialization() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Myclass object1 = new Myclass("Hello", -7, 2.1e10);
			FileOutputStream fos = new FileOutputStream("serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}
		catch(Exception e )
		{
			System.out.println("Serialization "+ e);
			System.exit(0);
			
		}
	
		try
		{
			int x;
			FileInputStream fis = new FileInputStream("serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			x=ois.readInt();
			ois.close();
			System.out.println(x);
		}
		catch(Exception e )
		{
			System.out.println("deserialization");
			System.exit(0);
			
		}
		

	}

}
class Myclass implements Serializable{
	String s;
	int i;
	double d;
	public Myclass(String s, int i, double d) {
		
		this.s = s;
		this.i = i;
		this.d = d;
	}
	
	
}
