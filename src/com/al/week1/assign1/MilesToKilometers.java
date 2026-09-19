package com.al.week1.assign1;
import java.util.Scanner;


public class MilesToKilometers {
	public void convertMiles() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Miles: ");
		double miles = input.nextDouble();
		
		double kilometers = miles * 1.60934;
		
		System.out.print("Kilometers: " + kilometers);
	}
}
