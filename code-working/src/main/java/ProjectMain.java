import java.util.Scanner;

public class ProjectMain {

    public static void main(String[] args) {
        int input1, input2;
        String operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Two numbers : ");
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        System.out.println("Select Operator : ");
        operator = sc.next();
        System.out.println("Result is " + calculateTwoInteger(input1, input2, operator));

    }

    static int calculateTwoInteger(int input1, int input2, String operator) {
        int result = 0;

        if (operator.equals("+")) {
            result = add(input1, input2);
        } else if (operator.equals("-")) {
            result = substract(input1, input2);
        } else if (operator.equals("*")) {
            result = multiply(input1, input2);
        } else if (operator.equals("/")) {
            result = divide(input1, input2);
        } else if (operator.equals("count")) {
            result = countMatchingNumbers(input1, input2);
        } else if (operator.equals("%")) {
            result = mod(input1, input2);
        }
        return result;
    }

    static int add(int input1, int input2) {
        return input1 + input2;
    }

    static int substract(int input1, int input2) {
        return input1 - input2;
    }

    static int multiply(int input1, int input2) {
        return input1 * input2;
    }

    static int divide(int input1, int input2) {
        return input1 / input2;
    }

    static int countMatchingNumbers(int input1, int input2) {
        int tmp, count, max, i ;
        int decimalUnitForSplit, decimalUnitForNext;

        max = countOfDigits(input1) - countOfDigits(input2);
        decimalUnitForSplit = tenPowerOf(max);
        decimalUnitForNext = tenPowerOf(countOfDigits(input1)-1);

        i = 0;
        count = 0;
        while (i <= max) {
            tmp = input1 / decimalUnitForSplit;

            if (tmp == input2) {
                count++;
            }

            input1 = input1 % (decimalUnitForNext);
            decimalUnitForNext = decimalUnitForNext / 10;
            decimalUnitForSplit = decimalUnitForSplit / 10;
            i++;
        }
        return count;
    }

    // custom - 나머지값 구하기
    static int mod(int input1, int input2) {
        return input1 % input2;
    }

    static int countOfDigits(int input) {
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;
        }

        return count;
    }

    static int tenPowerOf(int N){
        if( N == 0 )
            return 1;

        return tenPowerOf(N-1) * 10;
    }
}