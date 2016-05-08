package com.hashcoder.samplePrograms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeirdNumber {

	public WeirdNumber() {
		// TODO Auto-generated constructor stub
	}


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    	Scanner input = new Scanner(System.in);
    	if(input.hasNextInt())
    	{
    		int in = input.nextInt();
        	if(in >= 1 && in <= 100)
        	{
        		if(in%2==0)
        		{
        			if(in >=2 && in <=5)
        			{
        				System.out.println("Not Weird");
        			}
        			else if(in > 20)
        			{
        				System.out.println("Not Weird");
        			}
        			else
        			{
        				System.out.println("Weird");
        			}
        		}
        		else
        		{
        			System.out.println("Weird");
        		}
        	}
    	}
    	
    	
    }

}
