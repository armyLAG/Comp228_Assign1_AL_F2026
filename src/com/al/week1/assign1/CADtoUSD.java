package com.al.week1.assign1;
import java.util.Scanner;

public class CADtoUSD {
	public void convertCurrency() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter CAD: ");
		double cad = input.nextDouble();
		
		double usd = cad * 0.7144;
		
		System.out.print("USD: " + usd);
	}
}
