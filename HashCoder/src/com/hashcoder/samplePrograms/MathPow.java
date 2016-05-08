package com.hashcoder.samplePrograms;

import java.util.Scanner;

public class MathPow {

	public MathPow() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner input = new Scanner(System.in);
			
			
			
			while(input.hasNext())
			{
				String s = input.nextLine();
				String [] sArray = s.split("  ");
				
			
				int a = Integer.parseInt(sArray[0]);
				int b = Integer.parseInt(sArray[1]);
				
				myCalculator m = new myCalculator();
				System.out.println(m.power(a, b));
				//System.out.println(a +" "+ b);
				}
			
		}
		catch(Exception ex)
		{
			
		}
	}

}

class myCalculator 
{
	int power(int n, int p) throws Exception{
		if(n<0 || p<0) throw new Exception("test ");
		
			if(p==0) return 1;
			return n*power(n,p-1);
	}
	
}

