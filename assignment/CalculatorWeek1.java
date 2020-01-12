package calculator;

import java.util.Scanner;

public class Calculator // 계산기 클래스
{
	static int operand1; 
	static int operand2; 
	static char operator;
	
	static double resultOfOperation;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		getOperandAndOperator();
		resultOfOperation = operate(operand1, operand2, operator);
		printResult(operator, resultOfOperation);
		
	}
	
	static void getOperandAndOperator() {
		System.out.println("값을 두개 입력해 주세요!");
		scanOperand();
		
		System.out.println("연산을 입력해 주세요!");
		scanOperator();
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
			
		case '@' : //숫자 A가 숫자 B에 몇개 있는지 확인하는 함수를 호출하는 문자
			result = findHowManyNumberAIsInNumberB(operand1, operand2);
			break;
			
		case '^' : //A의 B승을 계산하는 함수를 호출하는 문자
			result = numberAPowerNumberB(operand1, operand2);
			break;
			
		default :
			System.out.println("연산자 입력이 잘못 되었습니다.");
			break;
		}
		
		return result;
	}
	

	static void printResult(char operator, double result) {
		switch(operator) {
			case '+' :
				System.out.println("더하기 결과 : " + String.valueOf(result));
				break;
		
			case '-' :
				System.out.println("빼기 결과 : " + String.valueOf(result));
				break;
		
			case '*' :
				System.out.println("곱하기 결과 : " + String.valueOf(result));
				break;
		
			case '/' :
				System.out.println("나누기 결과 : " + String.valueOf(result));
				break;
			
			case '@' :
				System.out.println("숫자 B가 숫자 A에  " +  String.valueOf((int)resultOfOperation) + "개 있습니다.");
				break;
				
			case '^' :
				System.out.println("거듭제곱 결과 : " + String.valueOf(result));
				break;
		
			default :
				break;
		}
	}

	static int findHowManyNumberAIsInNumberB (int numberA, int numberB) {
		int result = 0;
		
		while(numberA > 0) {
			if(numberA % 10 == numberB) {
				result++;	
			}
			numberA /= 10;
		}
		
		return result;
	}
	
	static int numberAPowerNumberB(int numberA, int numberB) { //A 제곱 B ( A ^ B ) 의 값을 리턴해주는 함수 , numberA와 numberB가 소수일 경우, numberB가 음수일 경우 지원X
		
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
