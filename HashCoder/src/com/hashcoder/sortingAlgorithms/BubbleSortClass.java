 /*
 * In bubble sort, we basically traverse the array from first
 * to array_length - 1 position and compare the element with the next one.
 * Element is swapped with the next element if the next element is smaller.
 *
 * Bubble sort steps are as follows.
 *
 * 1. Compare array[0] & array[1]
 * 2. If array[0] > array [1] swap it.
 * 3. Compare array[1] & array[2]
 * 4. If array[1] > array[2] swap it.
 * ...
 * 5. Compare array[n-1] & array[n]
 * 6. if [n-1] > array[n] then swap it.
 *
 * After this step we will have greatest element at the last index.
 *
 * Repeat the same steps for array[1] to array[n-1]
 *  
 */
package com.hashcoder.sortingAlgorithms;

public class BubbleSortClass {

	public BubbleSortClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp =0;
		int[] arrayOfInt = new int[]{5,90,35,45,150,3};//{45,23,12,57,90,54};
		//bubblesort
		System.out.println("OriginalArray: ");
		for(int i=0; i < arrayOfInt.length; i++){
            System.out.print(arrayOfInt[i] + " ");
		 }
		for(int i=0;i<arrayOfInt.length;i++)
		{
			for(int j=1;j<(arrayOfInt.length-i);j++)
			{
				if(arrayOfInt[j-1]>arrayOfInt[j])
				{
					tmp=arrayOfInt[j-1];
					arrayOfInt[j-1] = arrayOfInt[j];
					arrayOfInt[j] = tmp;
				}
			}
		}
		
		System.out.println("After BubbleSort: ");
		
		 for(int i=0; i < arrayOfInt.length; i++){
             System.out.print(arrayOfInt[i] + " ");
		 }
		
 
	}

}
