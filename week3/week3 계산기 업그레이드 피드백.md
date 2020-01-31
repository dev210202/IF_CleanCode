# 근우
### 하늬 Comment : 
 겹치는 변수들을 하나의 객체로 잘 모았음  
 getter/setter 잘 썼음  
 메인 클래스에서 객체 생성과 동작수행을 잘함  
 Inputs 객체 내 프로퍼티의 접근제한자를 private로 쓰지않음. 정보은닉 부족   
 Impl로 써야하는데 Imp로 씀  
### 이식 Comment :
scanner를 객체로 선언해서 받는 방식이 좋았음  
원래 의도는 Calculator에 생성자가 있어서 바로 실행하는건데 FunctionImp에 생성자가 들어가있음  

### 현주 Commnet :
자료형(Input, double)이 다르고 변수명이 input으로 겹치는 부분이 있는데 깔끔해서 그냥 둬도 괜찮을듯,,?  
private 이 없다 FunctionImp 아래에 저장된 변수들을 private으로 하면 될듯함  
인터페이스가 2개라서 더 깔끔하긴 한데 1개만 쓰기로 한 거 아녔나..? (아님 말고)  

# 하늬
### 근우 Comment : 
Main에서 calculator을 생성하는것인줄 알았는데 FunctionImpl을 사용함  
Dto라는 클래스 명이 어떤 것을 의미하는지 명확해서 좋았음  

### 이식 Comment : 
FuntionImpl은 기능에 관한것을 구현하는 클래스인데 이 부분에 Calculator부분까지 다 처리해버림  
계속해서 중복되는 매개변수(double a, double b)를 객체로 선언해서 처리하는 방식을 원했는데 구현하지 않았음  

### 현주 Comment : 
public class CalculateDto 아래에 있는 CalculateDto(){} 이 부분이 필요한건지 잘 모르겠음 (없으면 오류나나여?)  
private 에 변수 줄여도 되지 않을까?  

# 현주
### 근우 Comment : 
main과 calculator을 분리했으면 더 좋았을 것.  
setter가 없어요 아쉽  
코드 깔끔  

### 이식 Comment : 
 메인 클래스에서 Calculator객체를 생성하고 생성자로 실행을 시키는 방식을 원했는데 구현하지 않았음  
 계속해서 중복되는 매개변수(double a, double b)를 객체로 선언해서 처리하는 방식을 원했는데 구현하지 않았음  
 
### 하늬 Comment :
겹치는 변수들을 하나의 객체로 잘 모았음  
getter/setter중 setter만 썼음. 하나의 프로퍼티에 대해서 getter와 setter는 한 세트라고 생각하고 작성하면 좋을듯  
private로 정보은닉을 잘 했음  
main클래스에서 계산기 객체를 생성과 동시에 기능수행하게 짜지 않음. FunctionImpl 생성자에서 모든기능을 수행해야함  

 
# 이식
### 근우 Comment : 
isNotExistResult() 이 함수가 어떤것을 의미하는지 확실히 알수있는 bool형 함수였음  

### 하늬 Comment :
겹치는 변수들을 하나의 객체로 잘 모았음  
getter/setter 잘썼음  
main 클래스에서 객체 생성과 동시에 동작을 수행하게 잘 했음  
Calculator와 Input 클래스에서 private로 정보은닉을 잘 했음  

### 현주 Comment : 
질문 : 저는 operand나 operator 같이 받아오는 값이 있는 것만 private하면 된다고 생각했는데 FunctionImpl, Scanner 같은 것도 private하게 만들면 뭐가 좋은가요?)  