import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		String operator;
		System.out.println("값을 2개 입력해주세요!");
		
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("연산을 입력해주세요!");
		
		operator = sc.next();
		
		if(operator.equals("+")) add(x,y);
		else if(operator.equals("-")) subtract(x,y);
		else if(operator.equals("/")) divide(x,y);
		else if(operator.equals("*")) multiple(x,y);
		else if(operator.equals("count")) count(x,y);
		else if(operator.equals("custom")) custom(x,y);

	}
	
	private static void add(int a, int b) {
		System.out.println("더하기 결과 : " + (a + b));
	}
	
	private static void subtract(int a, int b) {
		System.out.println("빼기 결과 : " + (a - b));
	}

	private static void divide(int a, int b) {
		System.out.println("나누기 결과 : " + ((float)a / (float)b));
	}
	
	private static void multiple(int a, int b) {
		System.out.println("곱하기 결과 : " + a * b);
	}
	
	private static void count(int num, int findNum) {
		
		int count = 0;
		String number = Integer.toString(num);
		char findNumber = Character.forDigit(findNum, 10);
		
		for(int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == findNumber) {
				count++;
			}
		}
		
		System.out.println("카운트 결과 : " + count);
	
	}
	
	private static void custom(int a, int b) {
		System.out.println("커스텀 결과 : " + (float)(a * b)/(a + b));
	}
}
