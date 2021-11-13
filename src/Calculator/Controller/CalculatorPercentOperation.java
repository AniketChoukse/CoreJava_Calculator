package Calculator.Controller;

import java.util.Scanner;

public class CalculatorPercentOperation {

	double x, y;
	static Scanner input = new Scanner(System.in);

	public static void getPercentage() {
		double output = 0;
		double x, y;
		System.out.println("Enter value of : X ");
		x = input.nextDouble();
		System.out.println("Enter value of : Y ");
		y = input.nextDouble();
		System.out.println();

		output = (x * y) / 100;
		System.out.println("X% of Y = " + output);
		output = 0;

		output = (y / x) * 100;
		System.out.println("What percent of Y is X = " + output + "%");
		output = 0;

		String incDec = x < y ? "Increase" : "Decrease";
		if (incDec.equals("Increase")) {
			output = ((y - x) / x) * 100;
			System.out.println("Value of X to Y " + incDec + " by " + output + "%");
		} else if (incDec.equals("Decrease")) {
			output = ((y - x) / x) * 100;
			System.out.println("Value of X to Y " + incDec + " by " + output + "%");
		}

	}

	public double percentage() {
		double output = 0;
		int choice = 0;
//		//1) 10% of 100 = 10   =>  X*Y/100
//		//2) What percent of 27 is 6?   = >  (6/27) * 100
//		//3) What is the percentage inc and dec from X to Y 

		System.out.println("Percentage calculation Choice");
		System.out.println("X% of Y = ____                                                          1");
		System.out.println("What percent of Y is X = ______                                         2");
		System.out.println("What is the percentage increase or decrease from X to Y = _____         3");
		System.out.println(
				" Note : \"Percentage calculation is working for the following three cases please enter betweent 1 - 3 \"");

		System.out.println("Enter Choice : ");
		choice = input.nextInt();

		if (choice == 1 || choice == 2 || choice == 3) {

			System.out.println("Enter value of : X ");
			x = input.nextDouble();
			System.out.println("Enter value of : Y ");
			y = input.nextDouble();
			System.out.println();
			switch (choice) {
			case 1:
				output = (x * y) / 100;
				System.out.println("value of % is : " + output);
				break;
			case 2:
				output = (y / x) * 100;
				System.out.println("value of % is : " + output);
				break;
			case 3:
				String incDec = x < y ? "Increase" : "Decrease";
				if (incDec.equals("Increase")) {
					output = ((y - x) / x) * 100;
					System.out.println("Value of X to Y " + incDec + " by " + output + "%");
				} else if (incDec.equals("Decrease")) {
					output = ((y - x) / x) * 100;
					System.out.println("Value of X to Y " + incDec + " by " + output + "%");
				}

				break;

			default:
				break;
			}
		}

		return output;
	}
}
