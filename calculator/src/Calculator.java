public class Calculator extends Function {

    public static void main(String[] args) {

        Function f = new Function();

        f.setOperand1();
        f.setResultAsOperand1();

        while (true) {
            f.setOperator();
            String op = f.getOperator();

            if (op.equals("q") || op.equals("Q")) {
                System.out.println("Quit Calculator");
                break;
            }
            else if (op.equals("=")) {
                f.printResult();
            }
            else {
                f.setOperand2();
                f.setResultUpdated();
            }
        }
    }
}
