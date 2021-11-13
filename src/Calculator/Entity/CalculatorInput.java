package Calculator.Entity;

public class CalculatorInput {

	private double input1;
	private double input2;

	public CalculatorInput() {

	}

	public CalculatorInput(double input1, double input2) {
		this.input1 = input1;
		this.input2 = input2;
	}

	public double getInput1() {
		return input1;
	}

	public void setInput1(double input1) {
		this.input1 = input1;
	}

	public double getInput2() {
		return input2;
	}

	public void setInput2(double input2) {
		this.input2 = input2;
	}

}
