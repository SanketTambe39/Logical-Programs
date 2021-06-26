package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopwatchSimulator {

	public static void main(String[] args) {
		
		long time1=0,time2=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Please Enter 'Y' for strating the stopwatch ");
		String start=sc.next();
		
		if (start.equals("Y")||start.equals("y")) {
			
			time1=System.currentTimeMillis();
			//System.out.println(time1);
			
			System.out.println("Please Enter 'N' to stop the stopwatch");
			String stop=sc.next();
			
			if (stop.equals("N")||stop.equals("n")) {
				
				time2=System.currentTimeMillis();
				//System.out.println(time2);
				
				double n=(int)(time2-time1)/1000.0;
				System.out.println(n+"second");
			}
			else
			{
				System.out.println("You entered a wrong input (Stopwatch is continue)");
			}
		}
		else {
			System.out.println("You entered a wrong input");
		}
	}
	
}

