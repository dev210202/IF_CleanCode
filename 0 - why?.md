# 0. why?
## 우리는 왜 클린코드를 해야 하는가?
지금껏 코드를 치면서 가독성이 좋은 코드에 대해 고민해본적이 있나요?  
협업을 하면서 다른 사람의 코드를 주석없이 이해해 본적이 있나요?  

우리는 앞으로 수 많은 줄의 코드와 프로젝트를 하게 될겁니다.  
자연스럽게 다양한 사람들과 협업을 해야하고 그만큼 다른사람에게 자신의 코드에 대해 설명해야합니다.  

### 클린코드는 협업을 쉽게 할 수 있게 만들어줍니다.  
가독성을 높여 다른 사람이 코드를 봤을 때도 헷갈리지않고 코드를 이해할 수 있고 코드의 흐름을 쉽게 정리할 수 있습니다.  

### 클린코드는 코드 수정을 쉽게 할 수 있게 만들어줍니다.
클린코드를 통한 리팩토링으로 코드를 수정할 때도 복잡한 절차를 걸치지 않고 수정할 수 있게 해줍니다.



# example - before 
```java
public class Main(){
  public static void main(String[] args){
    Robot actionrobot = new Robot();
    actionrobot.takeaction(0); // walk
    actionrobot.takeaction(1); // stop
    actionrobot.takeaction(2); // jump
  }
}
```
객체의 이름과 메소드명이 모두 소문자로 되어있어 가독성이 떨어지고 메소드에서 무엇을 하는지 잘 알아볼 수 없습니다.

# example - after
```java
public class Main(){

  int COMMAND_WALK = 0;
  int COMMAND_STOP = 1;
  int COMMAND_JUMP = 2;
  
  public static void main(String[] args){
    Robot actionRobot = new Robot();
    actionRobot.action(COMMAND_WALK); 
    actionRobot.action(COMMAND_STOP); 
    actionRobot.action(COMMAND_JUMP); 
  }
}
```
객체의 이름과 메소드명의 가독성이 좋아졌고 주석없이도 메소드에서 어떤 동작을 수행하는지 알아볼 수 있습니다.
