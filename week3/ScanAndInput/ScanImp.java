package ScanAndInput;

import ScanAndInput.Scan;

import java.util.Scanner;

public class ScanImp implements Scan {
    Scanner scanner;

    public ScanImp() {
        scanner = new Scanner(System.in);
    }

    public double scanOperand() {
        double operand = scanner.nextInt();
        return operand;
    }

    public char scanOperator() {
        char operator = scanner.next().charAt(0);
        return operator;
    }
}
