package com.al.week1.assign1.Driver;

import java.util.Scanner;

import com.al.week1.assign1.CADtoUSD;
import com.al.week1.assign1.GradeCalculation;
import com.al.week1.assign1.LitersToGallons;
import com.al.week1.assign1.MilesToKilometers;



public class DriverMain {

	public static void main(String[] args) {
		

	
	 //Create objects for classes of Task a-d.	
		GradeCalculation gc = new GradeCalculation();
		MilesToKilometers miles = new MilesToKilometers();
		LitersToGallons liters = new LitersToGallons();
		CADtoUSD cad = new CADtoUSD();
		
		//Display the available operations to the user
		System.out.println("Enter the choice for operation  1.-Gradecacluation, 2-MilestoKms, 3-LiterstoGallons, 4- CADtoUSD");
	
		//Create Scanner to get the user's choice
		try (Scanner sc = new Scanner(System.in)) {
			int choice=sc.nextInt();
		
		
			//Use the user's choice to run the correct task
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
		    	  	break;
		        
		      
		    }
		
		}
		
	}

}
