import java.util.Scanner;

public class Calculator extends Function {

    public static double result = 0;

    public static void main(String[] args) {

        Function f = new Function();
        Scanner input = new Scanner(System.in);

        String operator;
        double num;
        f.messageGetNumber();
        num = f.getNumber(input);
        result += num;

        while (true) {
            f.messageGetOperator();
            operator = f.getOperator(input);

            if (operator.equals("=")) {
                f.printResult(result);
            } else {
                f.messageGetNumber();
                num = f.getNumber(input);
                result = f.updateResult(operator, result, num);
            }
        }
    }
}
