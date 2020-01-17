import java.util.Scanner;

public class function extends function_basic implements function_interface {

    @Override
    public void calculateAndPrint() {

        Scanner sc = new Scanner(System.in);

        float calculateValue;
        String newOperator;

        float input1 = sc.nextInt();
        String originalOperator = sc.next();
        float input2 = sc.nextInt();

        while (true) {
            calculateValue = calculate(input1, input2, originalOperator);

            newOperator = sc.next();

            if (newOperator.equals("=")) {
                System.out.println(calculateValue);

            } else if (newOperator.equals("quit")) {    // 종료문 quit으로 설정
                System.out.println("Calculation is ended....");
                return;

            } else {
                input2 = sc.nextInt();
                originalOperator= newOperator;
                input1 = calculateValue;
            }

        }
    }
}