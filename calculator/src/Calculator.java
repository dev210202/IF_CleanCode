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

    public static void getTwoNumbers() {
        System.out.print("값을 2개 입력하세요: ");
        firstNum = input.nextInt();
        secondNum = input.nextInt();
    }

    public static void getOperator() {
        System.out.println("연산자 목록 (더하기: + , 빼기: - , 곱하기: * , 나누기: / , 카운트: ? , 배수확인: @ )");
        System.out.print("연산자를 입력하세요: ");
        operator = input.next();
    }

    public static void add() {
        System.out.println("더하기 결과: " + (firstNum + secondNum));
    }

    public static void subtract() {
        System.out.println("빼기 결과: " + (firstNum - secondNum));
    }

    public static void multiply() {
        System.out.println("곱하기 결과: " + (firstNum * secondNum));
    }

    public static void divide() {
        if ((1.0 * firstNum / secondNum) == firstNum / secondNum)
            System.out.println("나누기 결과: " + (firstNum / secondNum));
        else
            System.out.println("나누기 결과: " + (1.0 * firstNum / secondNum));
    }

    public static void count() {

        int digit = 0;
        int cnt = 0;
        int secondNumCopy;
        int firstNumCopy;
        int multiply10digitTimes = 1;

        firstNumCopy = firstNum;
        secondNumCopy = secondNum;

        while (secondNumCopy > 0) {
            digit++;
            secondNumCopy = secondNumCopy / 10;
        }
        while (digit > 0) {
            multiply10digitTimes = multiply10digitTimes * 10;
            digit--;
        }
        while (firstNumCopy > 0) {
            if (firstNumCopy % multiply10digitTimes == secondNum)
                cnt++;
            firstNumCopy = firstNumCopy / 10;
        }
        System.out.println("카운트 결과: " + cnt);
    }

    public static void isItMultiple()
    {
        if (firstNum%secondNum ==0)
            System.out.println("첫번째 입력한 수가 두번째 입력한 수의 배수이다.");
        else
            System.out.println("첫번째 입력한 수가 두번째 입력한 수의 배수가 아니다.");
    }

    public static void printResult() {
        switch (operator) {
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
            case "/":
                divide();
                break;
            case "?":
                count();
                break;
            case "@":
                isItMultiple();
                break;
        }
    }
}

