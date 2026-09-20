package com.yd.assign1;
import java.util.Scanner;
/*
 * Author: Yiming(Daniel) Ding
 * Date: 09/19/2026
 * Description: Takes in 1 input which is mile from user and converts to
 * kilometer.
 */
public class CovnvertMilesToKilo {
	public void Convert(Scanner input) {
		// Constant from miles to kilometer is 1.60934
		double CONSTANT = 1.60934;
		double kilometer = 1;
		double miles = 1;
		// Let user input the miles
		System.out.print("Please enter miles: ");
		miles = input.nextDouble();
		
		// kilometer is equal to miles * CONSTANT
		kilometer = miles * CONSTANT;
		
		// print out the kilometer
		System.out.printf("Converted Kilometer is %.4f%n", kilometer);
	}
}
