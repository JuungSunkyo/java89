//주제 : 출력하는 방법
package step01;

public class Exam018 {
  public static void main(String[] args) {

    String name = "홍길동";
    int age = 20;
   //서식x
    System.out.println("이름: " + name + ", 나이: " +age);
    //서식o
    System.out.printf("이름: %s, 나이: %d\n" ,name, age);

  }
}
