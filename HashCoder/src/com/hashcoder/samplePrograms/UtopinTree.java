package com.hashcoder.samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UtopinTree {

	public UtopinTree() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t>=1 && t<=10)
        {
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int newVal =  UtopinTree.callRecursive(n);
	            //System.out.println("Test cases: "+n);
	            System.out.println(newVal);
	        }
        }
        
        
       
        

	}
	
	public static int callRecursive(int n)
	{
		
		//1=spring cycle = > doub;e its height
		//2=summer cycle = >increases height by 1
		
		// 1yr =  2 cycle                        1
		//          Spring + summer              2+1
		// 2yrs = 4 cycle
		//          2 Spring + 2 summer          6+1     
		// 3yrs = 6 cycle
		//        3 spring + 3 spring            14+1 
		
		boolean springBool = true;
	    int height = 1;
		for(int i=0; i <=n ; i++)
		{
			if(i>0)
			{	
			
			if(springBool)
			{
				height = (height)*2;
				springBool = false;
			}
			else
			{
				
				height =  height+1;
				springBool = true;
			}
			}
		}
		
		return height;
	}

}
