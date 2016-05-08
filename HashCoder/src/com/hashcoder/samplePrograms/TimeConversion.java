package com.hashcoder.samplePrograms;

import java.text.NumberFormat;
import java.util.Scanner;

public class TimeConversion {

	public TimeConversion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        String time = in.next();
        
		String [] timeArray = time.split(":");
		int hh =  (int)Integer.parseInt(timeArray[0]);
		int mm = (int)Integer.parseInt(timeArray[1]);
		String ss = timeArray[2];
		String newTime;
		if(hh > 0 && hh <= 12)
		{
			String shh;
			if(ss.indexOf("AM") > -1)
			{
				shh =  (hh!=12)?  String.format("%02d", hh):String.format("%02d", 0);
				newTime = shh+":"+String.format("%02d",mm)+":"+ss.replace("AM", "");
			}
			else
			{
				hh =  (hh==12)?hh:hh+12;
				newTime = String.format("%02d",hh)+":"+String.format("%02d",mm)+":"+ss.replace("PM", "");
			}
			System.out.println(newTime);
		}
		
	}

}
