package Calculator.Main;

import java.util.Scanner;

import Calculator.Controller.CalculatorHelper;
import Calculator.Controller.CalculatorOperation;
import Calculator.Controller.CalculatorPercentOperation;
import Calculator.Entity.CalculatorInput;

public class CalculatorMain {

	public static void main(String[] args) {

		CalculatorPercentOperation calPercentOperation = null;
		Scanner input = new Scanner(System.in);
		String operationName = "";
		double x, y;
		String action;
		int opration = -1;

		System.out.println(
				"---------------------------------Hello welcome to ZOHO Basic Calculator---------------------------------\n");

		do {
			System.out.println("Enter Operation Choice");
			System.out.println("Addition         1");
			System.out.println("Subtraction      2");
			System.out.println("multiplication   3");
			System.out.println("division         4");
			System.out.println("percentage       5");
			System.out.println("EXIT             0" + "\n");

			opration = input.nextInt();

			operationName = CalculatorHelper.operationName(opration);

			System.out.println("----------------" + operationName + " Operation" + "----------------" + "\n");

			if (opration == 5) {
				calPercentOperation = new CalculatorPercentOperation();
				CalculatorPercentOperation.getPercentage();
				// calPercentOperation.percentage();
			} else if (opration == 1 || opration == 2 || opration == 3 || opration == 4) {
				System.out.println("Enter value of : X ");
				x = input.nextDouble();
				System.out.println("Enter value of : Y ");
				y = input.nextDouble();

				System.out.println();

				CalculatorHelper.operationCases(x, y, opration);
			}
			System.out.println("\n Press \"Y\" " + "for continue or " + "\"N\" for Exit");
			action = input.next();
			if (action.equals("N") || action.equals("n")) {
				System.out.println("You are Exit from ZOHO Basic Calculator ");
			}
		} while (action.equals("Y") || action.equals("y"));

	}

}
