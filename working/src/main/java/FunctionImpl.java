import java.util.Scanner;

public class FunctionImpl implements Function {

    CalculateDto calc = new CalculateDto();

    public FunctionImpl() {

        Scanner sc = new Scanner(System.in);

        calc.setInput1(sc.nextInt());
        calc.setOriginOperator(sc.next());
        calc.setInput2(sc.nextInt());

        while (true) {
            double calculatedValue = calculate(
                    calc.getInput1(), calc.getInput2(), calc.getOriginOperator());

            calc.setCalculatedValue(calculatedValue);

            calc.setNewOperator(sc.next());

            if (calc.getNewOperator().equals("=")) {
                System.out.println(calculatedValue);

            } else if (calc.getNewOperator().equals("quit")) {    // 종료문 quit으로 설정
                System.out.println("Calculation is ended....");
                return;

            } else {
                calc.setInput2(sc.nextInt());
                calc.setOriginOperator(calc.getNewOperator());
                calc.setInput1(calculatedValue);
            }

        }
    }

    @Override
    public double calculate(double input1, double input2, String operator) {
        double result = 0;

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
    public double add(double input1, double input2) {
        return input1 + input2;
    }

    @Override
    public double substract(double input1, double input2) {
        return input1 - input2;
    }

    @Override
    public double multiply(double input1, double input2) {
        return input1 * input2;
    }

    @Override
    public double divide(double input1, double input2) {
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
    public double mod(double input1, double input2) {
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