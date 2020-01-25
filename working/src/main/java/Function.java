public interface Function {
    double calculate(double input1, double input2, String operator);

    double add(double input1, double input2);

    double substract(double input1, double input2);

    double multiply(double input1, double input2);

    double divide(double input1, double input2);

    int countMatchingNumbers(int input1, int input2);

    double mod(double input1, double input2);

    int countOfDigits(int input);

    int tenPowerOf(int N);
}