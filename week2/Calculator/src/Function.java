import java.util.Scanner;

public class Function implements FuntionType {

    // method overriding
    @Override
    public int add(int a, int b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public double add(int a, double b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public double add(double a, int b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public double add(double a, double b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        // TODO Auto-generated method stub
        return a - b;
    }

    @Override
    public double subtract(int a, double b) {
        // TODO Auto-generated method stub
        return a - b;
    }

    @Override
    public double subtract(double a, int b) {
        // TODO Auto-generated method stub
        return a - b;
    }

    @Override
    public double subtract(double a, double b) {
        // TODO Auto-generated method stub
        return a - b;
    }

    @Override
    public double divide(int a, int b) {
        // TODO Auto-generated method stub
        return (double) a / (double) b;
    }

    @Override
    public double divide(int a, double b) {
        // TODO Auto-generated method stub
        return (double) a / b;
    }

    @Override
    public double divide(double a, int b) {
        // TODO Auto-generated method stub
        return a / (double) b;
    }

    @Override
    public double divide(double a, double b) {
        // TODO Auto-generated method stub
        return a / b;
    }

    @Override
    public int multiple(int a, int b) {
        // TODO Auto-generated method stub
        return a * b;
    }

    @Override
    public double multiple(int a, double b) {
        // TODO Auto-generated method stub
        return a * b;
    }

    @Override
    public double multiple(double a, int b) {
        // TODO Auto-generated method stub
        return a * b;
    }

    @Override
    public double multiple(double a, double b) {
        // TODO Auto-generated method stub
        return a * b;
    }

    @Override
    public int countOfYInX(int num, int findNum) {
        // TODO Auto-generated method stub

        int count = 0;
        String number = Integer.toString(num);
        char findNumber = Character.forDigit(findNum, 10);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == findNumber) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int countOfYInX(double num, int findNum) {
        int count = 0;
        String number = Double.toString(num);
        char findNumber = Character.forDigit(findNum, 10);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == findNumber) {
                count++;
            }
        }

        return count;
    }

    @Override
    public double custom(int a, int b) {
        // TODO Auto-generated method stub
        return (double) (a * b) / (double) (a + b);
    }

    @Override
    public double custom(int a, double b) {
        // TODO Auto-generated method stub
        return (a * b) / (a + b);
    }

    @Override
    public double custom(double a, int b) {
        // TODO Auto-generated method stub
        return (a * b) / (a + b);
    }

    @Override
    public double custom(double a, double b) {
        // TODO Auto-generated method stub
        return (a * b) / (a + b);
    }

    @Override
    public void printSetMessage() {
        // TODO Auto-generated method stub
        System.out.println("입력해주세요");
    }

    @Override
    public void printResultMessage(double result) {
        // TODO Auto-generated method stub
        System.out.println("계산 결과 :" + result);
    }

    @Override
    public double calculate(double operand1, int operand2, String operator) {
        // TODO Auto-generated method stub
        switch (operator) {
            case "+":
                return add(operand1, operand2);
            case "-":
                return subtract(operand1, operand2);
            case "/":
                return divide(operand1, operand2);
            case "*":
                return multiple(operand1, operand2);
            case "count":
                return countOfYInX(operand1, operand2);
            case "custom":
                return custom(operand1, operand2);
            default:
                return 0;
        }
    }

    @Override
    public double calculate(int operand1, int operand2, String operator) {
        // TODO Auto-generated method stub
        switch (operator) {
            case "+":
                return add(operand1, operand2);
            case "-":
                return subtract(operand1, operand2);
            case "/":
                return divide(operand1, operand2);
            case "*":
                return multiple(operand1, operand2);
            case "count":
                return countOfYInX(operand1, operand2);
            case "custom":
                return custom(operand1, operand2);
            default:
                return 0;
        }
    }

    @Override
    public double calculateResult(int x, int y, String operator) {
        // TODO Auto-generated method stub
        return calculate(x, y, operator);
    }

    @Override
    public double calculateResult(double x, int y, String operator) {
        // TODO Auto-generated method stub
        return calculate(x, y, operator);

    }

}
