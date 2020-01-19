package calculator;

public interface FunctionOfCalculator {

    public double scanOperand();
    public char scanOperator();
    public void calculate(double operand1, double operand2, char operator);
}
