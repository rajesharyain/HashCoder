package com.hashcoder.collection;
import java.io.*;
import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int m; //0 < M < 2^32 - 1,
		LinkedList <Integer> intArray = new LinkedList<Integer>();
		
		//intArray.addFirst(e)
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter mth index:");
		String line = br.readLine();
		m = Integer.parseInt(line);
		
		//System.out.println("The mth index: "+(m-1));

		String line2 = br.readLine();
		String[] str = line2.split(" ");
		for ( int i=0; i<str.length;i++)
		{
			intArray.add(Integer.parseInt(str[i]));
			//System.out.println("Enter list Integers:"+ Integer.parseInt(str[i]));
		}
		
		if(intArray.size()-m >-1)
		{
		
			System.out.println(intArray.get(intArray.size()-m));
		}
		else {
			System.out.println("NIL");
		}
		

    }
}