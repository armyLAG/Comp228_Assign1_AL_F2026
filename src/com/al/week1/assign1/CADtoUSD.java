package com.al.week1.assign1;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CADtoUSD {
	public void convertCurrency() {
		
		//Create Scanner to get CAD amount from the user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter CAD: ");
		
		// Read the CAD amount as a BigDecimal
		BigDecimal cad = input.nextBigDecimal();
		
		//Current CAD to USD exchange rate
		BigDecimal exchangeRate = new BigDecimal("0.7144");
		
		//Round the currency amount to 2 decimal places
		BigDecimal usd = cad.multiply(exchangeRate);
		usd = usd.setScale(2, RoundingMode.HALF_UP);
		
		//Display the converted USD amount
		System.out.print("USD: " + usd);
	}
}
