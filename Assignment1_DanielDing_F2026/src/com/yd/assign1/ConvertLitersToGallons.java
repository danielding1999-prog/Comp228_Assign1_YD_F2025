package com.yd.assign1;

import java.util.Scanner;

public class ConvertLitersToGallons {

	public void Convert() {

		double CONSTANT = 0.264172;
		double liter;
		double gallon;

		System.out.print("Please enter liters: ");
		Scanner input = new Scanner(System.in);
		liter = input.nextDouble();
		input.close();
		
	
		gallon = liter * CONSTANT;
		

		System.out.println(gallon);
	}
}
