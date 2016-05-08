package com.hashcoder.samplePrograms;

import java.util.Scanner;

public class PrintInReverse {

	public PrintInReverse() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        if(n>0 && n <= (int)(Math.pow(10, 3))){
	        	int arr[] = new int[n];
		        for(int arr_i=0; arr_i < n; arr_i++){
		        	int t = in.nextInt();
		        	if(t > 0 && t <= (int)Math.pow(10, 4))
		        	{
		        		arr[arr_i] = t;
		        	}
		        	 
		        }
		        
		        for(int i=(arr.length-1);i>=0;i--)
		        {
		        	if(arr[i] > 0 && arr[i] < (int)Math.pow(10, 4))
		        	System.out.print(arr[i]+" ");
		        }
	        }
	        
	    }

}
