package com.hashcoder.samplePrograms;

public class StairCase {

	public StairCase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		     #
		    ##
		   ###
		  ####
		 #####
        ######
        */
		/*
		0 = 5 Spaces + 1 #
		1 = 4 Spaces + 2 #
		2 = 3 Spaces + 3 #
		3 = 2 Spaces + 4 #
		4 = 1 Spaces + 5 #
		3 = 0 Spaces + 6 #		
		*/
		 int n =  6;
	  for(int i=0; i < 6; i++)
	  {
		  
		  for(int j=0; j<=6;j++)
		  {  
			  System.out.print(j<6-i?" ":"#");
		  }
		  System.out.println("");
		  
	  }

	}

}
