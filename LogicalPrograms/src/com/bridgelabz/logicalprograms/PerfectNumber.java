package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to Check :: ");
		int number = scanner.nextInt();
		scanner.close();
		int sumOfFactors = 0;
		for (int i = 1; i < number; i++) {
			if (number%i == 0)
			{
				sumOfFactors += i; 
			}
		}
		if(sumOfFactors == number)
		{
			System.out.println("Given Number is Perfect Number");
		}
		else
		{
			System.out.println("Given Number is Not Perfect Number");
		}

	}

}
