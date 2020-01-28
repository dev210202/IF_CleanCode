public class Calculator {

    public Calculator() {
        FunctionImp func = new FunctionImp();

        System.out.println("식을 입력해주세요.");
        func.calculateFirstTime();

        System.out.println("결과에 이어서 계산하려 합니다. 식을 입력해주세요.");

        while(true) {
            func.calculateAfterFirstTime();
        }
    }
}
