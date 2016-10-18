//주제 :  변수 선언 - 배열 변수에 값넣기
package step03;

public class Exam033_2 {
  public static void main(String[] args) {
   //1) 배열에 값저장
    int[] scores = new int[3];
    scores[0] = 100; //배열 메모리의 번호(index)는 0번부터 시작한다.
    scores[1] = 100;
    scores[2] = 100;

    //배열의 인덱스 범위를 벗어나면 실행 오류 발생!
    //scores[3] = 100; //배열의 인덱스 범위는 0 ~(length-1)

   /*int[] scores2;
   score2[0] = 100; */

   //2)배열 변수 선언과 함께 값을 저장하기
   int[] scores3 = new int[] {80,81,82}; // 중괄호에 나열된 값 개수만큼 배열이 생성된다.
   System.out.println(scores3[2]);

  //3)배열변수 선언과 배열을 초기화 시키는 명령을 분리할 수 있다.
  int score4;
  scores4 = new int[] {80,81,82};

   //3) 배열 변수 선언과 함께 값을 지정할 때 new int[] 명령을 생략할 수 있다.
   //변수 선언에 어떤 종류의 메모리인지 지정되어 있기 때문에 생략 가능한 것이다.
   int[] score5 = {80,81,82};
   System.out.println(score5[1]);

   //주의) 배열 변수 따로 초기화 명령 따로 작성할 수 없다.
   int[] scores6;
   //scores5 = {80,81,82}; //컴파일오류!
   //배열 변수를 선언하고 따로 초기화 시킬때는 반드시 new int[]를 명시.
   scores6 = new int[] {80,81,82};

  //주의2 배열 선언할 때 값을 초기화 하는 명령이 있으면 배열 개수를 지정할수 없다.
  //초기화 명령({값,갑...})에서메모리 개수를 자동계산할 수 있기 때문이다.
  //int[] scores7 = new int[3] {100, 100, 100}; //컴파일오류
















  }
}
