/*
 * You are given two numbers a and b. Your task is to find the sum of two numbers.
 * Input
 * 		The first line contains an integer t, denoting the number of test cases. Next t lines contain two integers, a and b separated by a space.

		Input Constraint
		1 <= t <= 1000000000
		1 <= a, b <= 1000000000

		Output
		For every number a and b, output the sum of two numbers a and b.

		Solution Link http://code.hackerearth.com/2a8dd1Y
		Sample Input
		(Plaintext Link)
		
		1
		1 2

		Sample Output
		(Plaintext Link)

		3
		
*/

package com.hashcoder.samplePrograms;

import java.util.Scanner;

public class AddTwoNumbers {

	public AddTwoNumbers() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addDigits sum = new addDigits();
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("parseInt: "+input.next());
		
		System.out.println("Enter first num:");
		int firstNumber = input.nextInt();
		System.out.println("Enter Second num:");
		int secondNumber = input.nextInt();
		
		if((firstNumber >= 1 && firstNumber <= 1000000000) && (secondNumber >= 1 && secondNumber <= 1000000000))
		{
			
				sum.add(firstNumber,secondNumber);
			
		}
		else
		{
			System.out.println("Number not in the specified range [1,1000000000]");
		}
		
			
		
	}
	
	
}
class addDigits {
	

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sum of two digits: "+( a+b ) );
		
	}
}
