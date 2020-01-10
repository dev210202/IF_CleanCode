import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		String operator;
		System.out.println("���� 2�� �Է����ּ���!");
		
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("������ �Է����ּ���!");
		
		operator = sc.next();
		
		if(operator.equals("+")) add(x,y);
		else if(operator.equals("-")) subtract(x,y);
		else if(operator.equals("/")) divide(x,y);
		else if(operator.equals("*")) multiple(x,y);
		else if(operator.equals("count")) count(x,y);
		else if(operator.equals("custom")) custom(x,y);

	}
	
	private static void add(int a, int b) {
		System.out.println("���ϱ� ��� : " + (a + b));
	}
	
	private static void subtract(int a, int b) {
		System.out.println("���� ��� : " + (a - b));
	}

	private static void divide(int a, int b) {
		System.out.println("������ ��� : " + ((float)a / (float)b));
	}
	
	private static void multiple(int a, int b) {
		System.out.println("���ϱ� ��� : " + a * b);
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
		
		System.out.println("ī��Ʈ ��� : " + count);
	
	}
	
	private static void custom(int a, int b) {
		System.out.println("Ŀ���� ��� : " + (float)(a * b)/(a + b));
	}
}
