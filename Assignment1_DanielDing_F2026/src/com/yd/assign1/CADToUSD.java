package com.yd.assign1;
import java.util.Scanner;
/*
 * Author: Yiming(Daniel) Ding
 * Date: 09/19/2026
 * Description: Takes in 1 input from user which is CAD and convert it
 * to USD
 */
public class CADToUSD {

	public void Convert(Scanner input) {

		double CONSTANT = 0.71;
		double cad = 1;
		double usd = 1;

		System.out.print("Please enter CAD: ");
		cad = input.nextDouble();
		
	
		usd = cad * CONSTANT;
		

		System.out.printf("%.2f CAD is equal to %.2f USD%n", cad, usd);
}
}
