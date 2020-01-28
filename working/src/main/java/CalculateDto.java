public class CalculateDto {
    private double input1;
    private double input2;
    private double calculatedValue;
    private String newOperator;
    private String originOperator;

    public CalculateDto(){

    }

    public double getInput1(){
        return this.input1;
    }

    public void setInput1(double input1){
        this.input1 = input1;
        return;
    }

    public double getInput2(){
        return this.input2;
    }

    public void setInput2(double input2){
        this.input2 = input2;
        return;
    }

    public double getCalculatedValue(){
        return this.calculatedValue;
    }

    public void setCalculatedValue(double calculatedValue){
        this.calculatedValue = calculatedValue;
        return;
    }

    public String getNewOperator(){
        return this.newOperator;
    }

    public void setNewOperator(String newOperator){
        this.newOperator = newOperator;
        return;
    }

    public String getOriginOperator(){
        return this.originOperator;
    }

    public void setOriginOperator(String originOperator){
        this.originOperator = originOperator;
        return;
    }
}

