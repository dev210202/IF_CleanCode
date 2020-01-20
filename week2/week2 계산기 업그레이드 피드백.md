# 근우
### 하늬 Comment : 
scanOperator() - scanner.next().charAt(0)을 써서 굳이 연산자랑 피연산자 사이에 개행을 넣지 않아도돼서 편리하다  
메소드명 : ....First..과 ...AfterFirst(Time,Operand 등)은 초기 vs 이후 수행할 내용을 구분해서 로직을 쉽게 예상할 수 있어 좋음  
main에서 calculateAfterFirstTime() calculateFistTime() 내부에도 있어서 중복된다..  
```java
void calculateAfterFirstTime() {
   while (true) {
       operator = scanOperator();

       if (operator == '=') {
      System.out.println(result);
      break; // 대신 continue;
       }

       operand2 = scanOperand();

       calculate(result, operand2, operator);
   }
}
```
로만 바꿔도 main에서 while문 부분 안써도된다.  
### 이식 Comment :
scanAfterFirstOperand 메소드가 calculateAfterFirstTime메소드를 실행시키는데 이거는 그냥 메소드를 안만들고 calculateAfterFirstTime 메소드를 그냥 실행시키면 되지않나..?  
### 현주 Commnet :
인터페이스 FunctionOfCalcuator 보고 납득함,, 잘 만들었다고 생각!  
calculateFirstTime안에 있는 scanAferFirstOpernd를 그냥 calculateAfterFirstTime으로 쓰면 안됨? scanAfeterFirstOperand();라는게 필요하나?  
 
# 하늬
### 근우 Comment : 
메인이 깔끔하다는 생각이 듬, 하지만 calculate와 print로 분리해도 괜찮다는 생각이 듬.(1메소드1기능)
float =>double로 바꾸었으면 하는 생각이 있음
(이유 : double이 더 소수점 오차가 적고 요즘 컴퓨터가 좋아서 4바이트 정도의 크기는 마음껏 할당해도 괜찮을거 같음
float : 4byte, double : 8byte)
인터페이스 이름이 function_interface 말고 더 괜찮은 인터페이스 이름으로 지엇으면 하는 바람이 있음. 이름에 자료형이 들어가면 안좋다는 걸 어디서 본거같음(사실 나도 더 나은 이름을 모르겠음)

### 이식 Comment : 
메인에서 function객체만을 사용해서 작동하는 방식이 좋았음  
calculateAndPrint는 계산과 출력 2가지를 동시에 하는 메소드이기 때문에 계산은 계산대로 출력은 출력대로 빼는게 좋아보임.  
실수형 변수들을 float으로 선언해서 값을 초기화 시킬때 0f같이 초기화하는데 double로 하면 더 좋을 것 같다..?  
function, function_interface의 앞글자가 소문자여서 고쳐야한다고 생각  
function_interface는 스네이크 표기법인데 카멜로 고치는게..?  
사용자에게 입력받은 숫자를 float형으로 바꿔서 사용하는데 원래는 메소드 오버로딩을 이용해서 짜는걸 의도했음  

### 현주 Comment : 
메인 깔끔해서 소름돋았음;
변수 float calculateValue: 메소드를 동사로 하기로 했으니까 명사가 낫지않을까? calculatedValue 라던가
Int를 받아서 float으로 변환하던데, 그냥 float으로 받아도 되지 않을까
 
# 현주
### 근우 Comment : 
파일을 분리햇으면 더 좋았을 것  
전반적으로 코드가 깔끔  
updateResult함수의 파라미터가 다소 많은듯  
```java
  public void printResult(double a) {
        if ((int) a == a)
            System.out.println((int) a);
        else
            System.out.println(a);
    }
```
이 부분에서 (내생각에는) 결과값.0이 나오지 않게 하는것보다 .0이 나오더라도 그냥 출력하는게 더 코드의 양이 줄어들것 같다는 생각이 듬.  

### 이식 Comment : 
Funtion 클래스를 만들고 Interface나 추상클래스를 사용하여 기능과 관련된 메소드들을 빼도록 했는데 그렇게 하지 않았음.  
getNumber, getOperator 메소드에서 출력과 입력을 동시에 받음 분리시켜야 할듯 
custom기능 사라짐..  


### 하늬 Comment :
굳이 특화시키지 않아도되는 내용은 추상클래스로 만들어 상속시키고 각 기능들은 interface로 상속, 구현해서 코드 읽을 때 상속도?를 이해하는데 좋았음
main에 왜 Calculator 클래스(자기자신)을 한번더 생성했는가? 혹시 부모 클래스의 메소드를 쓰기 위해서라면 super.getNumber이런식으로 그냥 갖다 써도 되지않나?(에러나나?)  
함수 : getNumber(Scanner input) - Scanner를 파라미터로 넣어 처리하는게 신박했음. 그런데 피연산자로 nextDouble로 받아서 정수로 받으라는 조건과 맞지 않은듯..?  
CalculatorClass <-상속- Gettable 의 updateResult(Calculator,..)  
   ↘                      ↗  
    상속              변수(?)  
       ↘ Calculator ↗  

상속 관계가 잘 이해되지 않음..  
-> 메인함수 클래스, Calculator 클래스를 구분하는게 더 좋을 것 같음  


 
# 이식
### 근우 Comment : 
x, y 라는 변수는 뭔가 그래프의 느낌을 주는듯, 변수명을 operand라는 걸로 바꾸는게 좋을듯.  
@override라는걸로 인터페이스의 함수를 오버라이딩했다는걸 명시해 주는 것이 좋았음  
인터페이스의 메소드가 전반적으로 너무 많음.   
```java
	double custom(int a, int b);
    double custom(int a, double b);
    double custom(double a, int b);
    double custom(double a, double b);
```
꼼꼼하게 모든 자료형에 대해 구현하라고 강제하는 것은 좋으나 그냥 double로 처리해도 될꺼  같다는 생각이 듬.  
코드가 전반적으로 깔끔  
custom이라는 메소드 보다 이것이 무엇을 하는지 명시하는 이름을 짓는것도 괜찮을 듯  

### 하늬 Comment :
interface에 명세한 메소드가 좀 많은듯. 모든 케이스를 써놓을 필요는 없고 쓰는 만큼만 있으면 된다고 생각ㅇㅇ  
static 변수를 써서 메서드에 필요한 파라미터가 거의 없는 점이 좋음  
operator와 resultOperator를 나눈이유는 '=' 때문?  
변수명 x, y는 추상적임!  
IsOperator 반환부분에 꼭 Calculator써야되나?  
main의 while문 이해를 잘 몬하겟음ㅠ  
  ex) 1+3*4/5= 를 햇을 경우 = 나올때까지 계산 하나도 안하는것임? result계산을 어디서 하나요?  
  - 연산 긴거 넣으면 첫 연산자 계산 후 바로 출력하는게 맞음?  
    초기계산은 연산자 한개 잇는 계산만 가능 한 것처럼 보입니다. 여기서 굳이 출력 안해도될듯?  
  - 처음이자 마지막으로 연산자 한개 잇는 계산하고 끝내면 안되나?  
    while문 들어가서 = 하면 숫자 암거나 또 눌러줘야됨(더미변수)  

### 현주 Comment : 
저는 xml 파일이 굉장히 더러운데(계속 업데이트됨) 님은 어째서 깔끔한 것이죠..?  
scanOperandsAndOperators, scanNextOperandAndOperator 함수 나눈 이유? scanOperand와 scanOperator로 나누는게 낫지않나?  
isEntered랑 isOperator만든건 잘한듯 에러핸들링하기 좋을것같음  
인터페이스에서 자료형 별로 구분한 이유? 그냥 double로 다 하면 안되는 것인가..?  
calculate 랑 calculateResult 따로 만든 이유..? calculateResult  필요한가..?  





