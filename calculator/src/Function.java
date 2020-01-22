import java.util.Scanner;

public class Function implements CalculatorInterface {

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

    public double custom
    public void messageGetNumber() {
        System.out.print("Enter a number: ");
    }

    public void messageGetOperator() {
        System.out.print("Enter an operator: ");
    }


    public double getNumber(Scanner input) {
        return input.nextDouble();
    }

    public String getOperator(Scanner input) {
        return input.next();
    }

    public void printResult(double a) {
        if ((int) a == a)
            System.out.println((int) a);
        else
            System.out.println(a);
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
            default:
                System.out.println("Wrong Operator");
        }
        return localResult;
    }
}