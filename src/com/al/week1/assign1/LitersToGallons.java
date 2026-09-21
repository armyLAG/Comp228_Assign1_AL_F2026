package com.al.week1.assign1;
import java.util.Scanner;

public class LitersToGallons {
	public void convertLiters() {
		
		//Create Scanner to get the liters from the user
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Liters: ");
		
		//Store the amount of liters entered by the user
		double liters = input.nextDouble();
		
		//Convert liters to gallons
		double gallons = liters * 0.264172;
		
		
		//Display the converted amount it gallons
		System.out.print("Gallons: "  + gallons);
	}
}
