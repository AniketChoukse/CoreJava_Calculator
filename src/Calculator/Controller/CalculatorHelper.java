package Calculator.Controller;

import Calculator.Entity.CalculatorInput;

public class CalculatorHelper {

	public static void operationCases(double x, double y,int opt) {
		int opration = opt;
		 double output = 0;
		 CalculatorOperation calOperation = new CalculatorOperation();
		switch (opration) {
		case 1:
			CalculatorInput calInput1 = new CalculatorInput(x,y);
			output = calOperation.addition(calInput1);
			System.out.println("Addition output is : " + output);
			break;
		case 2:
			CalculatorInput calInput2 = new CalculatorInput(x,y);
			output = calOperation.subtraction(calInput2);
			System.out.println("Subtraction output is : " + output);
			break;
		case 3:
			CalculatorInput calInput3 = new CalculatorInput(x,y);
			output = calOperation.multiplication(calInput3);
			System.out.println("Multiplication output is : " + output);
			break;
		case 4:
			if(y!=0) {
				CalculatorInput calInput4 = new CalculatorInput(x,y);
				output = calOperation.division(calInput4);
				System.out.println("Division output is : " + output);
			}else{
				System.out.println("Division output is : " + "Output is Infinite");
			}
			break;
			
		default:
			System.out.println("This operation not in supported !!");
			System.out.println("Enter valid operation");
			break;
		}
	}
	
	public static String operationName(int opration) {
		String operationName = "";
		switch (opration) {
		case 1:
			operationName = "Addition";
			return operationName;
		case 2:
			operationName = "Subtraction";
			return operationName;
		case 3:
			operationName = "Multiplication";
			return operationName;
		case 4:
			operationName = "Division";
			return operationName;
		case 5:
			operationName = "Percentage";
			return operationName;
		case 0:
			operationName = "Exit from";
			return operationName;
							

		default:
			operationName = "Enter valid";
		 return	operationName;
			
		}
	}
	
	
}
