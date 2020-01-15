public abstract class function_basic {
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

    public float add(float input1, float input2) {
        return input1 + input2;
    }

    public float substract(float input1, float input2) {
        return input1 - input2;
    }

    public float multiply(float input1, float input2) {
        return input1 * input2;
    }

    public float divide(float input1, float input2) {
        return input1 / input2;
    }

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
    public float mod(float input1, float input2) {
        return input1 % input2;
    }

    public int countOfDigits(int input) {
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;
        }

        return count;
    }

    public int tenPowerOf(int N) {
        if (N == 0)
            return 1;

        return tenPowerOf(N - 1) * 10;
    }
}
