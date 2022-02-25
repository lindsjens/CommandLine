package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
	//name of program
		Scanner input = new Scanner(System.in);
		System.out.println("~*Welcome to the Luxurious Linear Converter*~");



		//ask the user to enter a length
		System.out.println("Please enter your length (in number format): ");
		String strLength = input.nextLine();
		double doubleLength = Double.parseDouble(strLength);
		//ask the user if the measurement is in (m)eters or (f)eet
		System.out.println("Is your length in (M)eters or (F)eet? (Please input M or F): ");
		String strmetersOrFeet = input.nextLine();
		//convert meters to feet and vice-versa
		if(strmetersOrFeet.equals("M")){
			double feetReturned = doubleLength * 3.2808399;
			System.out.println("Your old length was: "+doubleLength +strmetersOrFeet+ " Your New Length is: "+ feetReturned + "F");
		} else if(strmetersOrFeet.equals("F")){
			double metersReturned = doubleLength * .3048;
			System.out.println("Your old length was: "+doubleLength +strmetersOrFeet+" Your New Length is: "+ metersReturned + "M");
		}
		//display old and new measurements
	}

}
