package com.hashcoder.samplePrograms;

public class CloningOfnObject {

	public CloningOfnObject() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		SampleDmo obj1 = new SampleDmo(3);
		SampleDmo obj2 = obj1;
		
		
		System.out.println(obj2.equals(obj1) +": "+obj1.getValue());
		obj1.setValue(6);
		System.out.println(obj2.equals(obj1) +": "+obj2.getValue());

		/*for (int i=0;i<5;i++)
		{
			String s = "test "+i;
			System.out.println(s);
		}*/
	}

}

class SampleDmo
{
	private int abc = 2;

	public SampleDmo(int i) {
		this.abc = i;
	}

	public int getValue()
	{
		return this.abc;
	}
	public void setValue(int a)
	{
		this.abc = a;
	}
     	
}
