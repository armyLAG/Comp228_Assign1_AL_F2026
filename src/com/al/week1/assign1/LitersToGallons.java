package com.al.week1.assign1;
import java.util.Scanner;

public class LitersToGallons {
	public void convertLiters() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Liters: ");
		double liters = input.nextDouble();
		
		double gallons = liters * 0.264172;
		
		System.out.print("Gallons: "  + gallons);
	}
}
