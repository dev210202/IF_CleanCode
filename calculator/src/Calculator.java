import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        getTwoNumbers();
        getOperator();
        printResult();
    }
    public static Scanner input = new Scanner(System.in);
    public static int firstNum;
    public static int secondNum;
    public static String operator;

    public static void getTwoNumbers(){
        System.out.print("값을 2개 입력하세요: ");
        firstNum = input.nextInt();
        secondNum = input.nextInt();
    }

    public static void getOperator(){
        System.out.print("연산자를 입력하세요: ");
        operator = input.next();
    }

    public static void printResult(){
        switch (operator) {
            case "+":
                System.out.println("더하기 결과: " + (firstNum + secondNum));
                break;
            case "-":
                System.out.println("빼기 결과: " + (firstNum - secondNum));
                break;
            case "*":
                System.out.println("곱하기 결과: " + (firstNum * secondNum));
                break;
            case "/":
                if ((1.0 * firstNum / secondNum) == firstNum / secondNum)
                    System.out.println("나누기 결과: " + (firstNum/secondNum));
                else
                    System.out.println("나누기 결과: " + (1.0 * firstNum / secondNum));
                break;
        }
    }
}

