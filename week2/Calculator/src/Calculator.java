import java.util.Scanner;

public class Calculator {

    static int x;
    static String operator;
    static String resultOperator;
    static int y;
    static double result;
    static Function function = new Function();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        function.printSetMessage();
        scanOperandsAndOperators();
        result = function.calculateResult(x, y, operator);
        function.printResultMessage(result);

        while (IsEntered()) {

            scanNextOperandAndOperator();

            if (IsOperator("=")) {
                result = function.calculateResult(result, y, operator);
                function.printResultMessage(result);
            }

        }

    }

    public static void scanOperandsAndOperators() {
        x = sc.nextInt();
        operator = sc.next();
        y = sc.nextInt();
        resultOperator = sc.next();
    }

    public static void scanNextOperandAndOperator() {
        operator = sc.next();
        y = sc.nextInt();
        resultOperator = sc.next();
    }

    public static boolean IsEntered() {
        return sc.hasNext();
    }

    public static boolean IsOperator(String operator) {
        return Calculator.resultOperator.equals(operator);
    }

}
