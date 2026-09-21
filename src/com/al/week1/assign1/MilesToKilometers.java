package com.al.week1.assign1;
import java.util.Scanner;


public class MilesToKilometers {
	public void convertMiles() {
		
		//Create Scanner to get the miles from the user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Miles: ");
		
		//Store the amount of miles entered by the user
		double miles = input.nextDouble();
		
		//Convert miles to kilometers
		double kilometers = miles * 1.60934;
		
		//Display the converted amount in kilometers
		System.out.print("Kilometers: " + kilometers);
	}
}
