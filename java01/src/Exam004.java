public class Exam004 {
  public static void main3(String[] args) {
    System.out.println("main\n");
  }

  public static void main2(String[] args) {
    System.out.println("main2\n");
  }

  public static void main(String[] args) {
    System.out.println("main3\n");
  }
}


    /*
    =>function : 특정 작업을 수행하는 명령어를 언제든 재사용할 수 있도록 묶어둔 것.
    =>method : 관련된 function을 분류하여 class 블록에 넣어둔 것.
    =>실행할 수 있는 클래스: 다음 형식으로 선언된 메서드가 있는 클래스
      public static void main(String[] args) []
    =>JVM이 클래스를 실행할 때, 제일 먼저 위의 형식으로 된 메서드를 찾는다.
    없으면, 실행할 수 없다고 오류를 출력한다.
