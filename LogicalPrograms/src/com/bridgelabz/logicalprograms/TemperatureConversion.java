package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		System.out.println("1) fahrenheit to Celsius");
		System.out.println("2) Celsius to  fahrenheit");
		System.out.println("3) Exit");
		
		Scanner scanner = new Scanner(System.in);
		int ch=scanner.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Enter Fahrenheit :: ");
			double f1=scanner.nextDouble();
			double c1= (f1-32) * 5/9;
			System.out.println("conversion of given temprature is :: "+c1);
			break;
		case 2:
			System.out.println("Enter Celsius :: ");
			double c2=scanner.nextDouble();
			double f2= (c2* 9/5)+ 32;
			System.out.println("conversion of given temprature is :: "+f2);
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("You entered a wrong input");
			break;
		}
		scanner.close();

	}

}
