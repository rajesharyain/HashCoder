package com.hashcoder.samplePrograms;
/*
 * Given an integer, NN, traverse its digits (dd1,dd2,...,ddn) and determine how many digits evenly divide NN (i.e.: count the number of times NN divided by each digit ddi has a remainder of 00). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111N=111, the answer is 33).

Input Format

The first line is an integer, TT, indicating the number of test cases.
The TT subsequent lines each contain an integer, NN.

Constraints
1≤T≤151≤T≤15
0<N<1090<N<109

Output Format

For every test case, count and print (on a new line) the number of digits in NN that are able to evenly divide NN.

Sample Input

2
12
1012

Sample Output

2
3

Explanation

The number 1212 is broken into two digits, 11 and 22. When 1212 is divided by either of those digits, the calculation's remainder is 00; thus, the number of evenly-divisible digits in 1212 is 22.

The number 10121012 is broken into four digits, 11, 00, 11, and 22. 10121012 is evenly divisible by its digits 11, 11, and 22, but it is not divisible by 00 as division by zero is undefined; thus, our count of evenly divisible digits is 33.

Related Topics

    Div Mod
    Integer to Array

Submissions: 68041

Max Score:

25

Difficulty:

Easy
More

 * */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindDigits {

	public FindDigits() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	static int countDigits = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1<=T<=15
		//0<N<10 raise to the power 9
		
		//int n =12;
	
	 Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    int tmp = 0;
	    int modlus = 0;
	    if(t>=1 && t<=15)
	    {
		    for(int a0 = 0; a0 < t; a0++){
		        int n = in.nextInt();
		        
		        if(n>0 && n< Math.pow(10, 9))
		        {
		        	countDigits=0;
		        	addToIntegerList(n);
		        	//int count = findEvenDivisibleCount(n,dividend);
		        	//System.out.println("counter: "+FindDigits.countDigits);
		        	System.out.println(FindDigits.countDigits);
		        	//System.out.println(((123456789/7))%2);
		        }
		    }
	    }
	
	    
		//System.out.println((12/2)%2);
	    //System.out.println(Math.pow(10, 9));
	}

	
	private static void addToIntegerList(int n) {
		ArrayList<Integer> intArray  = new ArrayList<Integer>();
		int length = String.valueOf(n).length();
		int orignialVal = n;
		//System.out.println("length:"+length);
		while(length>0)
		{
			
			int tmp = n/10;//2012=101	
			intArray.add(n);
			n=tmp;//101
	    	length=length-1;
		}
		Iterator it = intArray.iterator();
		while(it.hasNext())
		{
			int j = (int) it.next();
			//System.out.println("item: "+j%10);
			int k = j%10;
			if(k>0)
			{
				
				System.out.println(orignialVal+ " Divided by value "+ k+ " = "+ orignialVal%k);
				
				if((orignialVal%k)==0)
	    		{
	    			FindDigits.countDigits++;
	    			
	    		}
			}
			
		}
		//System.out.println("FindDigits.countDigits"+ FindDigits.countDigits);
		
	}

}
