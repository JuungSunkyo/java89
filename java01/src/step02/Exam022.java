//주제 :  Literal-정수와 메모리 크기
package step02;

public class Exam022 {
  public static void main(String[] args) {
    System.out.println(100);//실행할때 4바이트
    System.out.println(1);//실행할때 4바이트
    System.out.println(100L);//실행할때 8바이트
    System.out.println(1l);
  }
}
