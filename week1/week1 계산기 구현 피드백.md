#근우
###하늬 Comment : 
메인 메소드에 수행할 내용이 명확해서 좋았음 
입력받은 변수들을 전역변수처럼 만들어 더미변수가 덜 만들어져서 좋았음
switch를 operate와 print 메소드에서 중복해서 쓰는 것 보다 operateAndPrint로 줄여서 하나의 switch문으로 result와 출력을 하면 좋을 것 같다.

###이식 Comment :
메인 메소드에 계산과정이 잘 보여서 좋았다
메소드명을 더 줄일 수 있는 방법은 없을까? 내용은 잘 보여주지만 너무 길다.

###현주 Commnet :
변수명이 깔끔해서 좋았음
operator를 char로 만들고 charAt(0)으로 하는 방식이 신선했음
 String.valueOf(result)로 한 이유가 특별히 있는지 궁금함. 그냥 result로 해도 괜찮지 않나?
함수에서 인자로 받거나 반환하는 결과는 result로 쓰고, 클래스에서 나타내는 결과는 resultOfOperation이라 구분이 되어서 좋았음
numberAPowerNumberB에서 numberB가 음수인 경우도 지원해도 되지 않을까?라는 생각이 들음


 
#하늬
###근우 Comment : 
if랑 else if 대신에 switch case를 썼으면 좋지 않을까?
 문자열 비교할때 equals 메소드를 써서 좋았음

###이식 Comment : 
count를 만들면서 추가적으로 메소드를 써서 복잡해보임 간결하게 줄일방법이 없을까?
tenPowerOf(N-1)을 (N - 1)로 수정하는건 어떨까?

###현주 Comment : 
equals 메소드로 연산자인 경우와 count인 경우를 모두 처리해서 좋았음
calculateTwoInteger 메소드가 계산만 하고 출력은 안해서 좋았음
countOfDigits라는 변수명이 좋았음
변수명 tmp, i, max는 무슨 기능을 하는지 몰라서 아쉬움
tenPowerOf를 재귀를 안쓰고 더 깔끔하게 하는 방법이 있지 않을까? 

 
#현주
###근우 Comment : 
메인 메소드를 완전히 분리시킨게 좋았음
 divde메소드에서 1.0보다는 앞에 형변환을 해주는게 나을 것 같음
 count함수가 추상적

###이식 Comment : 
메인 메소드에서 계산과정이 잘 보여서 좋았다
printResult가 먼저 수행되는데 맨 마지막에 선언되어 있어서 보기 불편했음 맨 위에 하는게 어떨까
count 과정이 복잡해 보임 더 간결하게 할 수있는 방법이 없을까..?


###하늬 Comment :
메인 메소드에 수행할 내용이 명확해서 좋았음
입력받은 변수들을 전역변수처럼 만들어 더미변수가 덜 만들어져서 좋았음
printResult메소드에서 switch를 써서 더 깔끔해 보임


 
#이식
###근우 Comment : 
count 메소드의 이름이 추상적인 것 같음. 
문자열 비교할 때 equals 메소드를 써서 좋았음
 count함수에서 string으로 형변환해서 하는부분이 좋았음

###하늬 Comment :
count 메소드의 이름에 count하는 대상도 적어주면 좋을 것 같음
대상을 숫자대신 문자열로 바꿔 함수 양이 많이 줄어 읽기 편하다. (좋은 로직)
add 등 연산하는 메소드에서 출력도 해서 이름과 맞지 않는듯

###현주 Comment : 
operator.equals로 처리한 것이 좋다고 생각함
if else 부분이 한 줄인데 저랑 다른 방식이라 이런 스타일도 통일하면 좋을 것 같다고 생각함
나누기 (float)으로 한거 좋다고 생각함
count를 toString으로 해서 함수가 깔끔해짐.
count함수에서 num은 Int형이고 number은 String형인데 이런 것도 구분하는 방법이 있음면 좋지않을까?라는 생각이 들음
custom 이 어떤 계산인지는 알겠는데 이게 계산기에 필요한 식인가?라는 생각이 들음

