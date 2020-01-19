package calculator;

import java.util.Scanner;

public class Function implements FunctionOfCalculator{

    Scanner scanner = new Scanner(System.in);

    double operand1;
    double operand2;
    char operator;

    double result;

    public double scanOperand() {
	double operand = scanner.nextInt();
	return operand;
    }

    public char scanOperator() {
	char operator = scanner.next().charAt(0);
	return operator;
    }

    void calculateFirstTime() {
	operand1 = scanOperand();
	result = operand1;
	scanAfterFirstOperand();
    }
    
    void scanAfterFirstOperand() {
	calculateAfterFirstTime();
    }

    void calculateAfterFirstTime() {
	while (true) {
	    operator = scanOperator();

	    if (operator == '=') {
		System.out.println(result);
		break;
	    }

	    operand2 = scanOperand();

	    calculate(result, operand2, operator);
	}
    }

    public void calculate(double operand1, double operand2, char operator) {
	switch (operator) {
	case '+':
	    result = operand1 + operand2;
	    break;

	case '-':
	    result = operand1 - operand2;
	    break;

	case '*':
	    result = operand1 * operand2;
	    break;

	case '/':
	    result = operand1 / operand2;
	    break;
	}
    }

}
