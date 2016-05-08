package com.hashcoder.corejava.palindrom;

import java.util.Scanner;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		
		System.out.println("Please input a string");
		Scanner in = new Scanner(System.in);
		
		input = in.next();
		System.out.println("Input length :"+ input.length());
		
		
		char[] revereOfInput = new char[input.length()];
		
		
		//reverse 
		for(int j = 0; j<input.length(); j++ )
		{
			revereOfInput[j] = input.charAt(input.length()-1-j);
		}
		
		
		String output = new String(revereOfInput);
		
		if(output.equals(input))
		{
			System.out.println(input + " is a pallindrome");
		}
		else
		{
			System.out.println(input + " is not a pallindrome");
		}
		

	}

}
