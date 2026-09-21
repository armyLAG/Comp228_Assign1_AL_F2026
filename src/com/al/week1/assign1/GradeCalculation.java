package com.al.week1.assign1;

import java.util.Scanner;

public class GradeCalculation {

	public void GradeCalc() {

		//Array to store marks for 6 subjects
		int marks[] = new int[6];
		
		
		int i;
		float total = 0, avg;

		//Create Scanner to get the marks from the user
		try (Scanner scanner = new Scanner(System.in)) {
			
			
			//Ask the user to enter marks for all 6 subjects
			for (i = 0; i < 6; i++) {

				System.out.print("Enter Marks of Subject" + (i + 1) + ":");
				marks[i] = scanner.nextInt();
				
				//Add each subject mark to the total
				total = total + marks[i];
			}
			scanner.close();
		}

		// Calculating average here
		avg = total / 6;
		
		//Displaying the students grade based on their average
		System.out.print("The student Grade is: ");
		
		if (avg >= 90) {
			System.out.print("A");
			
		} else if (avg >= 80 && avg < 90) {
			System.out.print("B");
			
		} else if (avg >= 70 && avg < 80) {
		    System.out.print("C");

		} else if (avg >= 60 && avg < 70) { 
		    System.out.print("D");

		} else {
		    System.out.print("F");
		}
		
		

		
	}
	
}
