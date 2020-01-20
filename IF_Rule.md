IF CleanCode Rule

# Week1
1. bool타입 함수는 시작이름을 is, has로 시작한다
2. camel표기법 사용(isOdd, inThisCase 등등)
3. 무엇인가를 의미하는 상수는 static final을 쓰고 대문자로 표시하고 단어별로 나눌 때 언더바를 사용한다.  
ex) static final int ARRAY_SIZE = 100;
4. 메소드명은 15자 이내로
5. 연산자 사이는 공백을 넣어서 가독성을 늘린다.
6. tmp같은 임시변수는 무엇을 위해 쓰이는지 변수에 명시하도록 한다.
7. max나 min 같은 비교할 때 쓰이는 변수는 무엇을 비교하는지 대상을 명시하도록 한다.
8. 단순 문자비교는 switch를 쓰고 복잡한 비교는 if문을 사용한다.
9. 실수형은 double로 표현한다.  
10. 인터페이스를 상속받는 클래스면 클래스명 뒤에 Impl을 붙인다  
