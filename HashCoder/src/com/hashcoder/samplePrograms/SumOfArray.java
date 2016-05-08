package com.hashcoder.samplePrograms;

import java.util.Scanner;

public class SumOfArray {

	public SumOfArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        long sum = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt(); 
            sum = sum+arr[arr_i];
           
        }
        System.out.println(sum);

	}

}
