package com.bridgelabz.logicalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many Coupon you want? :: ");

		int numberOfCoupons = scanner.nextInt();
		scanner.close();

		getCoupons(numberOfCoupons);

	}
	private static void getCoupons(int numberOfCoupons) {
		
		int[] couponsCodes;		
		couponsCodes = new int[numberOfCoupons];
		int countOfcoupons = 0;
		
		while (countOfcoupons < numberOfCoupons )
		{
			int code = (int) Math.floor(Math.random() *10000);
		
			boolean couponInCouponsCode = false;
			
			for (int j = 0; j < couponsCodes.length; j++)
			{
				if (code  == couponsCodes[j]) 
				{
					couponInCouponsCode = true;
				}
			}
			
			if(!(couponInCouponsCode)) {				
				couponsCodes[countOfcoupons++] = code;
			}
		}
		System.out.println("These are "+numberOfCoupons+" coupons you want :: "+Arrays.toString(couponsCodes));
	}

}
