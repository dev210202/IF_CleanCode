import java.util.Scanner;

public class Function implements CalculatorInterface {

    private double operand1;
    private double operand2;
    private String operator;
    private double result;

    Scanner input = new Scanner(System.in);

    public void setOperand1() {
        this.operand1 = input.nextDouble();
    }

    public void setOperand2() {
        this.operand2 = input.nextDouble();
    }

    public void setOperator() {
        this.operator = input.next();
    }

    public void setResultAsOperand1() {
        this.result = operand1;
    }

    public String getOperator() {
        return operator;
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

    public double getCountOfBInA(double a, double b){

        int A = (int) a;
        int B = (int) b;
        int digitOfB = 0;
        int cntOfBInA = 0;
        int multiply10digitTimes = 1;

        if (!(isItInteger(a) && isItInteger(b))) {
            System.out.println("Can't count because it's not integer.");
            // should throw an error
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

    public void printResult() {
        if (isItInteger(result))
            System.out.println((int) result);
        else
            System.out.println(result);
    }

    public boolean isItInteger(double a) {
        return a == (int) a;
    }

    public void setResultUpdated() {

        switch (operator) {
            case "+":
                this.result = add(result, operand2);
                break;
            case "-":
                this.result = subtract(result, operand2);
                break;
            case "*":
                this.result = multiply(result, operand2);
                break;
            case "/":
                this.result = divide(result, operand2);
                break;
            case "?":
                this.result = getCountOfBInA(result, operand2);
                break;
            default:
                System.out.println("Wrong Operator");
        }
    }

    public void exampleMessage(){
        System.out.println("+ : addition , - : subtraction , * : multiplication , / : division, ? : count, q : quit");
        System.out.println("Please enter as an example below.");
        System.out.println("1 + 2 + 3 =");
        System.out.println("6");
        System.out.println("* 2 =");
        System.out.println("12");
    }
}
