package calculator;

import java.util.Scanner;

public class Calculator
{
	static int operand1; 
	static int operand2; 
	static char operator;
	
	static double resultOfOperation;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("���� �ΰ� �Է��� �ּ���!");
		scanOperand();
		
		System.out.println("������ �Է��� �ּ���!");
		scanOperator();
		
		resultOfOperation = operate(operand1, operand2, operator);
		printResult(operator, resultOfOperation);
	
		System.out.println("0�̻� 9 �̸��� ���� A�� ���� B�� ��� ����ִ��� Ȯ���ϰ��� �մϴ�.");
		System.out.println("A�� B�� ������� �Է����ּ���.");
		
		scanOperand();
		resultOfOperation = findHowManyNumberAIsInNumberB(operand1, operand2);
		System.out.println("���� B�� ���� A�� " +  String.valueOf(resultOfOperation) + "�� �ֽ��ϴ�.");	
	}
	
	static void scanOperand() {
		operand1 = scanner.nextInt();
		operand2 = scanner.nextInt();
	}
	
	static void scanOperator() {
		operator = scanner.next().charAt(0);
		
	}
	
	static double operate(int operand1, int operand2, char operator) {
		
		double result = 0;
		
		switch(operator) {
		case '+' :
			result = operand1 + operand2;
			break;
			
		case '-' :
			result = operand1 - operand2;
			break;
			
		case '*' :
			result = operand1 * operand2;
			break;
			
		case '/' :
			result = (double)operand1 / operand2;
			break;
			
		case '^' :
			result = numberAPowerNumberB(operand1, operand2);
			break;
			
		default :
			System.out.println("������ �Է��� �߸� �Ǿ����ϴ�.");
			break;
		}
		
		return result;
	}
	

	static void printResult(char operator, double result) {
		switch(operator) {
			case '+' :
				System.out.println("���ϱ� ��� : " + String.valueOf(result));
				break;
		
			case '-' :
				System.out.println("���� ��� : " + String.valueOf(result));
				break;
		
			case '*' :
				System.out.println("���ϱ� ��� : " + String.valueOf(result));
				break;
		
			case '/' :
				System.out.println("������ ��� : " + String.valueOf(result));
				break;
				
			case '^' :
				System.out.println("�ŵ����� ��� : " + String.valueOf(result));
				break;
		
		
			default :
				break;
		}
	}

	static int findHowManyNumberAIsInNumberB (int numberA, int numberB) {
		int result = 0;
		
		while(numberB > 0) {
			if(numberB % 10 == numberA) {
				result++;	
			}
			numberB /= 10;
		}
		
		return result;
	}
	
	static int numberAPowerNumberB(int numberA, int numberB) { //A ���� B ( A ^ B ) �� ���� �������ִ� �Լ� , numberA�� numberB�� �Ҽ��� ���, numberB�� ������ ��� ����X
		
		int result = 1;
		
		if(numberA == 0) {
			return 0;
		}

		if(numberB == 0) { 
			return result;
		}
	
		
		if(numberB > 0) {
			for(int i = 0 ; i < numberB ; i++) {
				result *= numberB;
			}
			return result;
		}
		
		else {
			return -1;
		}
	}
	
}
