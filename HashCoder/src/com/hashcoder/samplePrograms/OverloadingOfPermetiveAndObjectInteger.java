package com.hashcoder.samplePrograms;

public class OverloadingOfPermetiveAndObjectInteger {

	public OverloadingOfPermetiveAndObjectInteger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingOfPermetiveAndObjectInteger d = new OverloadingOfPermetiveAndObjectInteger();
		d.display(6);

	}

	public void display(Integer i)
	{
		System.out.println("Wrapper of Data Type"  + i);
		System.out.println("Wrapper of Data Type"+ (i instanceof Integer));
	}
	
	public void display(int i)
	{
		System.out.println("Peremitive Data Type " + i);
		
	}
	
	

}
