import java.util.Scanner;

public class Calculator {

    private double result = 0;
    private FunctionImpl function = new FunctionImpl();
    private Scanner sc = new Scanner(System.in);
    private Input input = new Input();


    public Calculator() {

        function.printSetMessage();

        while (isEntered()) {
            if (isNotExistResult()) {
                scanOperand1AndOperator();
                result = function.calculate(input);
            } else {
                scanOperatorAndOperand2();
                result = function.calculate(input);
            }

            input.setOperator(sc.next());

            if (isOperator("=")) {
                function.printResultMessage(result);
                input.setOperand1(result);
            }

        }

    }


    private void scanOperand1AndOperator() {
        input.setOperand1(sc.nextDouble());
        input.setOperator(sc.next());
        input.setOperand2(sc.nextDouble());
    }

    private void scanOperatorAndOperand2() {
        input.setOperator(sc.next());
        input.setOperand2(sc.nextDouble());
    }


    private boolean isNotExistResult() {
        return result == 0;
    }

    private boolean isEntered() {
        return sc.hasNext();
    }

    private boolean isOperator(String operator) {
        String receivedOperator = input.getOperator();
        return receivedOperator.equals(operator);
    }

}
