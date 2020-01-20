import java.util.Scanner;

public class function implements function_interface {

    @Override
    public void calculateAndPrint() {

        Scanner sc = new Scanner(System.in);

        float calculateValue, input1, input2;
        String newOperator;
        int inputINT1, inputINT2;

        inputINT1 = sc.nextInt();
        String originalOperator = sc.next();
        inputINT2 = sc.nextInt();

        input1 = (float) inputINT1;
        input2 = (float) inputINT2;

        while (true) {
            calculateValue = calculate(input1, input2, originalOperator);

            newOperator = sc.next();

            if (newOperator.equals("=")) {
                System.out.println(calculateValue);

            } else if (newOperator.equals("quit")) {    // 종료문 quit으로 설정
                System.out.println("Calculation is ended....");
                return;

            } else {
                inputINT2 = sc.nextInt();
                input2 = (float)inputINT2;
                originalOperator= newOperator;
                input1 = calculateValue;
            }

        }
    }

    @Override
    public float calculate(float input1, float input2, String operator) {
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
            result = countMatchingNumbers((int) input1, (int) input2);
        } else if (operator.equals("%")) {
            result = mod(input1, input2);
        }
        return result;
    }

    @Override
    public float add(float input1, float input2) {
        return input1 + input2;
    }

    @Override
    public float substract(float input1, float input2) {
        return input1 - input2;
    }

    @Override
    public float multiply(float input1, float input2) {
        return input1 * input2;
    }

    @Override
    public float divide(float input1, float input2) {
        return input1 / input2;
    }

    @Override
    public int countMatchingNumbers(int input1, int input2) {
        int tmpForUnit, count, endPoint, i;
        int decimalUnitForSplit, decimalUnitForNext;

        endPoint = countOfDigits(input1) - countOfDigits(input2);
        decimalUnitForSplit = tenPowerOf(endPoint);
        decimalUnitForNext = tenPowerOf(countOfDigits(input1) - 1);

        i = 0;
        count = 0;
        while (i <= endPoint) {
            tmpForUnit = input1 / decimalUnitForSplit;

            if (tmpForUnit == input2) {
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
    @Override
    public float mod(float input1, float input2) {
        return input1 % input2;
    }

    @Override
    public int countOfDigits(int input) {
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;
        }

        return count;
    }

    @Override
    public int tenPowerOf(int N) {
        if (N == 0)
            return 1;

        return tenPowerOf(N - 1) * 10;
    }
}