/**
 * There is a lmited ATM machine.Only five Customers can take money per day from this ATM. Maximum amount of cash this ATM can issue per day is limited to Rs 100,000 If total amount of money (M) that users have taken is greater than Rs 100,000 ATM will stop its service for more customers for the day.

When user enter an amount of money that he/she wants, ATM will make sure to give the amount by lowest number of notes per a transaction.User can take 5000,2000,1000,500,100,50 & 10 notes.When the user enter some amount the answer should be printed.

For make the problem easy we are only concidering one input from one user

Other limit that ATM has is to prevent a ATM card theft which is stolen ATM card being used at the ATM machine. Therefore ATM has another limit where a user can only take maximum Rs20000. Coins can't be taken.

M<=100000 & M>0

Input Format

Series of values seperated by a new line
2300

Output Format

number of notes that you took. Note values will be Sri Lankan standard note values.

Sample Input

2560

Sample Output

2000 1,500 1,50 1,10 1,

Explanation

21000
output-please enter correct
 */
package com.hashcoder.samplePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ATM {

	public ATM() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		ATMMachine am = new ATMMachine();
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int t = input.nextInt();
			if((t>0 && t< 100000 ) && (t%10==0))
			{
			    int result = am.withDrawMoney(t);
			}
			else
			{
				System.out.println("please enter correct");
			}
		}	
	}

}

class ATMMachine {
	int [] notesInMachine  = {5000,2000,1000,500,100,50,10};
	int limitPerDayTranscation = 20000;
    int [] amontArray;	
    
	public int withDrawMoney(int amount)
	{
		if(amount < 20000)
		{
		 int arrayLength = notesInMachine.length;
		 for(int i=0; i<notesInMachine.length; i++)
	        {
        		int multipleOf = amount/notesInMachine[i];
        		if(multipleOf!=0){
        			//System.out.println(notesInMachine[i] +"  "+multipleOf);
        			System.out.print(notesInMachine[i] +" "+multipleOf+",");
            		amount = amount- (notesInMachine[i] * multipleOf);
        		}
	        }		
		}
		else
		{
			System.out.println("please enter correct");
		}
		return 1;
	}
	
	
}
