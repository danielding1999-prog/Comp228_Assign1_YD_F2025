package com.yd.assign1;

import java.util.Scanner;

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
