package calculator;

public class Calculator {

  
    public static void main(String[] args) {
	Function func = new Function();

	System.out.println("���� �Է����ּ���.");
	func.calculateFirstTime();
	
	while(true) {
	    System.out.println("����� �̾ ����ϱ� ���� ���� �Է����ּ���.");
	    func.calculateAfterFirstTime();
	}
    }
}
