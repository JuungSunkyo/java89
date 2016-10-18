//주제 :  변수 선언 - 다른 종류의 메모리를 여러 개 묶어서 준비하기
package step03;

public class Exam035 {
  //class 문법을 사용하여 메모리묶음을 선언한다.
  //4종의 메모리를 묶어 새 데이터 타입을 만든다.
  //=> 배열은 오직 같은 종류의 메모리만 여러개 준비 할 수 있다.
  //=> 클래스 문법을 사용하면 다른 종류의 메모리를 여러개 준비할 수 있다.
  //scores는 String1개 int4개 float 1개로 구성된 메모리임을 정의하는 것이지
  //메모리를 즉시 준비하는 것은 아니다. 즉 score는 메모리를 준비할때 참고할 설계도
  static class Score {
     String name;
     int kor;
     int eng;
     int math;
     int sum;
     float aver;
  }
  public static void main(String[] args) {
    //1) 인스턴스 준비
    //1)클래스에 정의된 대로 복합 메모리 준비하기
     // 이렇게 준비한 복합 메모리를 '인스턴스'
    Score s1 = new Score();

    //2)복합 메모리에 값 넣기
    //인스턴스이름. 내부메모리의 이름
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    //3)복합 메모리의 값 꺼내기
    System.out.println(s1.name);
    System.out.println(s1.kor);
    System.out.println(s1.eng);
    System.out.println(s1.math);
    System.out.println(s1.sum);
    System.out.println(s1.aver);






  }
}
