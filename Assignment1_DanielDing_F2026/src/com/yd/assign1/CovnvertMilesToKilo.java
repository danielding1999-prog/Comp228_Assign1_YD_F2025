package com.yd.assign1;
import java.util.Scanner;
public class CovnvertMilesToKilo {
	public void Convert() {
		// Constant from miles to kilometer is 1.60934
		double CONSTANT = 1.60934;
		double kilometer;
		double miles;
		// Let user input the miles
		System.out.print("Please enter miles: ");
		Scanner input = new Scanner(System.in);
		miles = input.nextDouble();
		input.close();
		
		// kilometer is equal to miles * CONSTANT
		kilometer = miles * CONSTANT;
		
		// print out the kilometer
		System.out.println(kilometer);
	}
}
