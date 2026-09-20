package com.yd.assign1;
import java.util.Scanner;
/*
 * Author: Yiming(Daniel) Ding
 * Date: 09/19/2026
 * Description: Takes in 1 input which is litter from user and converts to
 * gallon.
 */
public class ConvertLitersToGallons {

	public void Convert(Scanner input) {

		double CONSTANT = 0.264172;
		double liter = 1;
		double gallon = 1;

		System.out.print("Please enter liters: ");
		liter = input.nextDouble();
		
	
		gallon = liter * CONSTANT;
		

		System.out.printf("The coverted gallon is %.4f%n", gallon);
	}
}
