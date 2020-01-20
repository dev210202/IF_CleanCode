import java.util.Scanner;
interface Calculatable {

    public double add(double a, double b);

    public double subtract(double a, double b);

    public double multiply(double a, double b);

    public double divide(double a, double b);
}

interface Gettable {

    public double getNumber(Scanner input);

    String getOperator(Scanner input);

    public void printResult(double a);

    public double updateResult(Calculator c, String op, double a, double b);
}


class CalculatorClass implements Calculatable, Gettable{

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

    public double getNumber(Scanner input) {
        System.out.print("Enter a number: ");
        return input.nextDouble();
    }

    public String getOperator(Scanner input) {
        System.out.print("Enter an operator: ");
        return input.next();
    }

    public void printResult(double a) {
        if ((int) a == a)
            System.out.println((int) a);
        else
            System.out.println(a);
    }

    public double updateResult(Calculator c, String op, double result, double a) {

        double localResult = result;
        switch (op) {
            case "=":
                break;
            case "+":
                localResult = c.add(result, a);
                break;
            case "-":
                localResult = c.subtract(result, a);
                break;
            case "*":
                localResult = c.multiply(result, a);
                break;
            case "/":
                localResult = c.divide(result, a);
                break;
            default:
                System.out.println("Wrong Operator");
        }
        return localResult;
    }
}

public class Calculator extends CalculatorClass {

    public static double result = 0;
    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner input = new Scanner(System.in);

        String operator;
        double num;

        num = c.getNumber(input);
        result += num;

        while (true) {
            operator = c.getOperator(input);

            if (operator.equals("=")) {
                c.printResult(result);
            }
            else {
                num = c.getNumber(input);
                result = c.updateResult(c, operator, result, num);
            }
        }
    }
}
