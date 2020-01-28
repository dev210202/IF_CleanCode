import ScanAndInput.Inputs;
import ScanAndInput.ScanImp;

public class FunctionImp implements Function {
    Inputs input;
    ScanImp scan;
    double result;

    public FunctionImp() {
        input = new Inputs();
        scan = new ScanImp();
    }

    void calculateFirstTime() {
        input.setOperand1(scan.scanOperand());
        result = input.getOperand1();
        calculateAfterFirstTime();
    }

    void calculateAfterFirstTime() {
        while (true) {
            input.setOperator(scan.scanOperator());

            if (input.getOperator() == '=') {
                System.out.println(result);
                break;
            }

            input.setOperand2(scan.scanOperand());

            input.setOperand1(result);
            calculate(input);
        }
    }

    public void calculate(Inputs input) {
        switch (input.getOperator()) {
            case '+':
                result = input.getOperand1() +input.getOperand2();
                break;

            case '-':
                result = input.getOperand1() - input.getOperand2();
                break;

            case '*':
                result = input.getOperand1() * input.getOperand2();
                break;

            case '/':
                result = input.getOperand1() / input.getOperand2();
                break;
        }
    }
}