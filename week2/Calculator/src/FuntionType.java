public interface FuntionType {
    // method overloading
    int add(int a, int b);
    double add(int a, double b);
    double add(double a, int b);
    double add(double a, double b);

    int subtract(int a, int b);
    double subtract(int a, double b);
    double subtract(double a, int b);
    double subtract(double a, double b);

    double divide(int a, int b);
    double divide(int a, double b);
    double divide(double a, int b);
    double divide(double a, double b);

    int multiple(int a, int b);
    double multiple(int a, double b);
    double multiple(double a, int b);
    double multiple(double a, double b);

    int countOfYInX(int num, int findNum);
    int countOfYInX(double num, int findNum);

    double custom(int a, int b);
    double custom(int a, double b);
    double custom(double a, int b);
    double custom(double a, double b);

    void printSetMessage();
    void printResultMessage(double result);

    double calculate(double operand1, int operand2, String operator);
    double calculate(int operand1, int operand2, String operator);

    double calculateResult(int x, int y, String operator);
    double calculateResult(double x, int y, String operator);
}
