package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("              __,aaPPPPPPPPaa,__\n" +
				"          ,adP\"\"\"'          `\"\"Yb,_\n" +
				"       ,adP'                     `\"Yb,\n" +
				"     ,dP'     ,aadPP\"\"\"\"\"YYba,_     `\"Y,\n" +
				"    ,P'    ,aP\"'            `\"\"Ya,     \"Y,\n" +
				"   ,P'    aP'     _________     `\"Ya    `Yb,\n" +
				"  ,P'    d\"    ,adP\"\"\"\"\"\"\"\"Yba,    `Y,    \"Y,\n" +
				" ,d'   ,d'   ,dP\"            `Yb,   `Y,    `Y,\n" +
				" d'   ,d'   ,d'    ,dP\"\"Yb,    `Y,   `Y,    `b\n" +
				" 8    d'    d'   ,d\"      \"b,   `Y,   `8,    Y,\n" +
				" 8    8     8    d'    _   `Y,   `8    `8    `b\n" +
				" 8    8     8    8     8    `8    8     8     8\n" +
				" 8    Y,    Y,   `b, ,aP     P    8    ,P     8\n" +
				" I,   `Y,   `Ya    \"\"\"\"     d'   ,P    d\"    ,P\n" +
				" `Y,   `8,    `Ya         ,8\"   ,P'   ,P'    d'\n" +
				"  `Y,   `Ya,    `Ya,,__,,d\"'   ,P'   ,P\"    ,P\n" +
				"   `Y,    `Ya,     `\"\"\"\"'     ,P'   ,d\"    ,P'\n" +
				"    `Yb,    `\"Ya,_          ,d\"    ,P'    ,P'\n" +
				"      `Yb,      \"\"YbaaaaaadP\"     ,P'    ,P'   Normand\n" +
				"        `Yba,                   ,d'    ,dP'    Veilleux\n" +
				"           `\"Yba,__       __,adP\"     dP\"\n" +
				"               `\"\"\"\"\"\"\"\"\"\"\"\"\"'\n");
		System.out.println("           __,aa Fibonacci Finder aa,__");




		//name of your program

		//ask user to a #
		System.out.println("Please enter your Fibonacci number: ");
		String strfibInputNumber = input.nextLine();
		int intFibNumber = Integer.parseInt(strfibInputNumber);

		if(intFibNumber <= 0){
			System.out.println(" 0, 1 ");
		}else if (intFibNumber == 1){
			System.out.println("0, 1, 1");
		}else {

			System.out.println("what is the input value after going thru parse int, " + intFibNumber);
			//display the Fibonacci sequence leading up to that number << stop at given number
			int[] fibonacciArray = new int[intFibNumber + 2];

			fibonacciArray[0] = 0;
			fibonacciArray[1] = 1;

			int index = 2;
			while (fibonacciArray[index - 1] < intFibNumber) {
				fibonacciArray[index] = fibonacciArray[index - 1] + fibonacciArray[index - 2];
				System.out.println(fibonacciArray[index]);
				index++;

			}

		}
		//sequence starts with 0 and 1. If user inputs 0, or a negative number, print "0,1"

		//if input is 1, print "0, 1, 1"

	}

}
