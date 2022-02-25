package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//name of program
		System.out.println("Hello! You have reached the Temperature Converter!");
		//prompt user to enter a temperature (number)
		System.out.println("Please enter the temperature, make sure it's a number: ");
		String strTemperature = input.nextLine();
		double doubleTemperature = Double.parseDouble(strTemperature);

		//user input Celsius or Fahrenheit
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit? Please enter C or F");
		String strCelciusorFahrenheit = input.nextLine();
		//convert to either F or C

		if (strCelciusorFahrenheit.equals("C")){
			double doubleconvertTemp = doubleTemperature * 1.8 + 32;
			System.out.println("Original Temperature was: " +doubleTemperature+ " New Celsius Temperature is:" +doubleconvertTemp);
		}
		else if (strCelciusorFahrenheit.equals("F")){
			double doubleConvertFahrenheit = (doubleTemperature -32) / 8;
			System.out.println("Original Temperature was: " +doubleTemperature+ " New Celsius Temperature is:" +doubleConvertFahrenheit);
		}
		//
		//create array?
		/*if ( ){
		} else{
		}
		 */

		// display new and old temps



	}

}
