import java.util.Scanner;

public class ProjectMain {

    public static void main(String[] args) {
        float input1, input2;
        String operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Two numbers : ");
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        System.out.println("Select Operator : ");
        operator = sc.next();
        System.out.println("Result is " + calculateTwoInteger(input1, input2, operator));

    }

    static float calculateTwoInteger(float input1, float input2, String operator) {
        float result = 0f;

        if (operator.equals("+")) {
            result = add(input1, input2);
        } else if (operator.equals("-")) {
            result = substract(input1, input2);
        } else if (operator.equals("*")) {
            result = multiply(input1, input2);
        } else if (operator.equals("/")) {
            result = divide(input1, input2);
        } else if (operator.equals("count")) {
            result = countMatchingNumbers((int)input1, (int)input2);
        } else if (operator.equals("%")) {
            result = mod(input1, input2);
        }
        return result;
    }

    static float add(float input1, float input2) {
        return input1 + input2;
    }

    static float substract(float input1, float input2) {
        return input1 - input2;
    }

    static float multiply(float input1, float input2) {
        return input1 * input2;
    }

    static float divide(float input1, float input2) {
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
    static float mod(float input1, float input2) {
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