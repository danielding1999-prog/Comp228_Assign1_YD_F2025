package com.yd.assign1;
import java.util.Scanner;
/*
 * Author: Yiming(Daniel) Ding
 * Date: 09/19/2026
 * Description: Takes in 1 input which is litter from user and converts to
 * gallon.
 */
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
		

		System.out.printf("The coverted gallon is %.4f%n", gallon);
	}
}
