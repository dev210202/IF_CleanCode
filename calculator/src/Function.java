import java.util.Scanner;

public class Function implements CalculatorInterface {

    private double operand1;
    private double operand2;
    private String operator;
    private double result;

    Scanner input = new Scanner(System.in);

    public void setOperand1(double operand1){
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2){
        this.operand2 = operand2;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }

    public void setResult(double result){
        this.result = result;
    }

    public double getOperand1(){
        return operand1;
    }

    public double getOperand2(){
        return operand2;
    }

    public String getOperator(){
        return operator;
    }

    public double getResult(){
        return result;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double getCountOfBInA(double a, double b) {

        int A = (int) a;
        int B = (int) b;
        int digitOfB = 0;
        int cntOfBInA = 0;
        int multiply10digitTimes = 1;

        if ( !(isItInteger(a) && isItInteger(b))) {
            System.out.println("Can't count because it's not integer.");
            // Error throw
        }

        while (B > 0) {
            digitOfB++;
            B = B / 10;
        }
        B = (int) b;

        while (digitOfB > 0) {
            multiply10digitTimes = multiply10digitTimes * 10;
            digitOfB--;
        }

        while (A > 0) {
            if (A % multiply10digitTimes == B)
                cntOfBInA++;
            A = A / 10;
        }

        return cntOfBInA;
    }

    public void messageGetNumber() {
        System.out.print("Enter a number: ");
    }

    public void messageGetOperator() {
        System.out.print("Enter an operator: ");
    }

    public void printResult() {
        if (isItInteger(result))
            System.out.println((int) result);
        else
            System.out.println(result);
    }

    public boolean isItInteger(double a) {
        if ((int) a == a) {
            return true;
        }
        else {
            return false;
        }
    }

    public double updateResult(String op, double result, double a) {

        double localResult = result;
        switch (op) {
            case "=":
                break;
            case "+":
                localResult = add(result, a);
                break;
            case "-":
                localResult = subtract(result, a);
                break;
            case "*":
                localResult = multiply(result, a);
                break;
            case "/":
                localResult = divide(result, a);
                break;
            case "?":
                localResult = getCountOfBInA(result, a);
                break;
            default:
                System.out.println("Wrong Operator");
        }
        return localResult;
    }
}