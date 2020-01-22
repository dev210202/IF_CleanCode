import java.util.Scanner;

public interface CalculatorInterface {
    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

    void messageGetNumber();

    void messageGetOperator();

    double getNumber(Scanner input);

    String getOperator(Scanner input);

    void printResult(double a);

    double updateResult(String op, double a, double b);
}
