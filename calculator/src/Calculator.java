public class Calculator extends FunctionImpl {

    public static void main(String[] args) {

        FunctionImpl f = new FunctionImpl();

        f.showExample();

        f.setOperand1();
        f.setResultAsOperand1();

        while (true) {

            f.setOperator();

            String op = f.getOperator();
            if (op.equals("q")) {
                System.out.println("Quit");
                break;
            }
            else if (op.equals("=")) {
                f.printResult();
            }
            else
            {
                f.setOperand2();
                f.setResultUpdated();
            }
        }
    }
}
