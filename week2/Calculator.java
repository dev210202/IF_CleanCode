package calculator;

public class Calculator {

  
    public static void main(String[] args) {
	Function func = new Function();

	System.out.println("식을 입력해주세요.");
	func.calculateFirstTime();
	
	while(true) {
	    System.out.println("결과에 이어서 계산하기 위해 식을 입력해주세요.");
	    func.calculateAfterFirstTime();
	}
    }
}
