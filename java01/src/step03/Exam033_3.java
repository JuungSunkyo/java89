//주제 :  변수 선언 - 배열 변수에 값넣기
package step03;

public class Exam033_3 {
  public static void main(String[] args) {
   //1) 배열에 값저장
    int[] scores = new int[] {100, 100, 100};

    //2)배열의 개수 알아내기
    //=>모든 배열은 length라는 이름의 변수가 있다.
    //=> 이변수는 배열 매모리의 개수를 보관한다.
    System.out.println(scores.length);
  }
}
