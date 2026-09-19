package com.al.week1.assign1.Driver;

import java.util.Scanner;

import com.al.week1.assign1.CADtoUSD;
import com.al.week1.assign1.GradeCalculation;
import com.al.week1.assign1.LitersToGallons;
import com.al.week1.assign1.MilesToKilometers;



public class DriverMain {

	public static void main(String[] args) {
		

	/*
	 * Create objects for classes of Task a-d.	
	 * 
	 * 
	 */
		
	// for example tasks grade calculation goes as below..
		GradeCalculation gc = new GradeCalculation();
// create objects for all the classes..  and then call the method using switch case.. 
		MilesToKilometers miles = new MilesToKilometers();
		
		LitersToGallons liters = new LitersToGallons();
		
		CADtoUSD cad = new CADtoUSD();
		
	System.out.println("Enter the choice for operation  1.-Gradecacluation, 2-MilestoKms, 3-LiterstoGallons, 4- CADtoUSD");
	try (Scanner sc = new Scanner(System.in)) {
		int choice=sc.nextInt();
		
		
		    switch (choice) {
		      case 1:
		    	  	 System.out.println("Doing Grade Calculation.. ");
		      	gc.GradeCalc();
		        break;
		      case 2:
		        System.out.println("Doing Miles to Kilometers Conversion..");
		        miles.convertMiles();
		        break;
		      case 3:
		    	System.out.println("Doing Liters to Gallons Conversion: ");
		    	liters.convertLiters();
		    	  break;
		      case 4:
		    	System.out.println("Doing CAD to USD Conversion ");
		    	cad.convertCurrency();
		        
		      
		    }
	}
		
		
		
	
		
	}

}
