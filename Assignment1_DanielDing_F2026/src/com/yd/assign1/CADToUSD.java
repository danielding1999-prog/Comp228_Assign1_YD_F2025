package com.yd.assign1;
import java.util.Scanner;
/*
 * Author: Yiming(Daniel) Ding
 * Date: 09/19/2026
 * Description: Takes in 1 input from user which is CAD and convert it
 * to USD
 */
public class CADToUSD {

	public void Convert() {

		double CONSTANT = 0.71;
		double cad;
		double usd;

		System.out.print("Please enter CAD: ");
		Scanner input = new Scanner(System.in);
		cad = input.nextDouble();
		input.close();
		
	
		usd = cad * CONSTANT;
		

		System.out.println(usd+" USD");
}
}
