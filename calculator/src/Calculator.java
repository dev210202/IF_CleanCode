import java.util.Scanner;

public class Calculator {

    public static Scanner input = new Scanner(System.in);
    public static double result = 0;
    public static String operator;
    public static double num;

    public static void main(String[] args) {

        result += getNumber();

        while (true) {
            operator = getOperator();
            if (operator.equals("="))
            {
                if ((int) result == result)
                    System.out.println("= "+(int)result);
                else
                    System.out.println("= "+ result);
            }
            else {
                num = getNumber();
                updateResult(operator, num);
            }
        }
    }

    public static double getNumber() {
        System.out.print("Enter a number: ");
        return input.nextDouble();
    }

    public static String getOperator() {
        System.out.print("Enter an operator: ");
        return input.next();
    }

    public static void updateResult(String op, double newNum) {

        switch (op) {
            case "=":
                break;
            case "+":
                add(newNum);
                break;
            case "-":
                subtract(newNum);
                break;
            case "*":
                multiply(newNum);
                break;
            case "/":
                divide(newNum);
                break;
            default:
                System.out.println("Wrong Operator");
        }

    }

    public static void add(double a) {
        result = result + a;
    }

    public static void subtract(double a) {
        result = result - a;
    }

    public static void multiply(double a) {
        result = result * a;
    }

    public static void divide(double a) {
        result = result / a;
    }

}

