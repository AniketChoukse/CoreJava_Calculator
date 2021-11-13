package Calculator.Controller;

import java.util.Scanner;

import Calculator.Entity.CalculatorInput;

public class CalculatorOperation {
	
	CalculatorInput inputObj = new CalculatorInput(); 
	double x ,y;
	
	
	public double addition(CalculatorInput inputObj) {
		double output = 0;
		x = inputObj.getInput1();
		y = inputObj.getInput2();
		output = x + y;
		return output;
	}
	
	public double subtraction(CalculatorInput inputObj) {
		double output = 0;
		x = inputObj.getInput1();
		y = inputObj.getInput2();
		output = x - y;
		return output;
	}
	
	public double multiplication(CalculatorInput inputObj) {
		double output = 0;
		x = inputObj.getInput1();
		y = inputObj.getInput2();
		output = x * y;
		return output;
	}
	
	public double division(CalculatorInput inputObj) {
		double output = 0;
		x = inputObj.getInput1();
		y = inputObj.getInput2();
		output = x / y;
		return output;
	}
	


}
