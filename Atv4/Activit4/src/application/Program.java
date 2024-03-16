package application;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class Program {

//	make a program to read the dollar rate,
//	and then a value in dollars to be purchased by a person in reais.
//	Inform how many reais the person will pay for the dollars,
//	considering that the person will have to pay 60% of IOF on the value in dollars.
//	Create a CurrencyConverter class to be responsible for the calculations

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		currencyConverter cv = new currencyConverter();

		System.out.printf("What is the dollar price? ");
		cv.dollarPrice = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		cv.realBought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", cv.converter());
		
		sc.close();
	}

}