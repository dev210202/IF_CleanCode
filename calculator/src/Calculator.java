import java.util.Scanner;

public class Calculator extends Function {

    public static void main(String[] args) {

        Function f = new Function();
        Scanner input = new Scanner(System.in);

        f.messageGetNumber();
        f.setOperand1(input.nextDouble());
        f.setResult(f.getOperand1());

        while (true) {
            f.messageGetOperator();
            f.setOperator(input.next());

            if (f.getOperator().equals("=")) {
                f.printResult();
            } else {
                f.messageGetNumber();
                f.setOperand2(input.nextDouble());
                f.setResult(f.updateResult(f.getOperator(), f.getResult(), f.getOperand2()));
            }
        }
    }
}
