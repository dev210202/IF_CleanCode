public class FunctionImpl implements Funtion {

    @Override
    public double add(Input input) {
        // TODO Auto-generated method stub
        return input.getOperand1() + input.getOperand2();
    }

    @Override
    public double subtract(Input input) {
        // TODO Auto-generated method stub
        return input.getOperand1() - input.getOperand2();
    }


    @Override
    public double divide(Input input) {
        // TODO Auto-generated method stub
        return input.getOperand1() / input.getOperand2();
    }


    @Override
    public double multiple(Input input) {
        // TODO Auto-generated method stub
        return input.getOperand1() * input.getOperand2();
    }

    @Override
    public int countOfYInX(Input input) {
        int count = 0;
        String number = Double.toString(input.getOperand1());
        int findNum = (int) input.getOperand2();
        char findNumber = Character.forDigit(findNum, 10);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == findNumber) {
                count++;
            }
        }

        return count;
    }


    @Override
    public double custom(Input input) {
        // TODO Auto-generated method stub
        return (input.getOperand1() * input.getOperand2()) / (input.getOperand1() + input.getOperand2());
    }

    @Override
    public void printSetMessage() {
        // TODO Auto-generated method stub
        System.out.println("입력해주세요");
    }

    @Override
    public void printResultMessage(double result) {
        // TODO Auto-generated method stub
        System.out.println("계산 결과 :" + result);
    }

    @Override
    public double calculate(Input input) {
        // TODO Auto-generated method stub
        switch (input.getOperator()) {
            case "+":
                return add(input);
            case "-":
                return subtract(input);
            case "/":
                return divide(input);
            case "*":
                return multiple(input);
            case "count":
                return countOfYInX(input);
            case "custom":
                return custom(input);
            default:
                return 0;
        }
    }

}
