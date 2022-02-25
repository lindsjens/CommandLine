package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//name of program
		System.out.print("              ===================\n" +
				"			|| Numbers to Binary ||\n" +
				"			||     Converter     ||\n" +
				"			  =================== \n");

		//ask the user for decimal values separated by spaces
		System.out.println("Please enter a series of decimal values (whole ###), separated by spaces: ");
		String strnumUserInput = input.nextLine();
		String[] inputValueArray = strnumUserInput.split(" ");
		// do a loop to get the individual string out of the array
		for (int i=0; i<inputValueArray.length; i++){
			String seperateNumber = inputValueArray[i];
			//pulled the number out into a string, want to change that string to the binary number
			int numUserInput = Integer.parseInt(seperateNumber);
			String binaryOutput = Integer.toBinaryString(numUserInput);
			System.out.println("The number you entered was: "+seperateNumber+ " The binary for that is "+binaryOutput);
		}





		//	}




		//display each decimal integer along with it's binary equivalent
		//take the numbers the user inputs and put the separate numbers in an array
		//the user inputs/string are all going to be together, separate out the numbers

		//take each of the array elements and convert them to binary
		//we don't know the size of the array - user could input any amount of numbers


		//return the original input number and tell the user the binary #

		//}


	}
}
