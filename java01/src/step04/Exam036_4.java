//주제 : 연산자 - 산술연산자 : 강제로 데이터 유형을 바꾸기 : 암시적 형변환
package step04;

public class Exam036_4 {
  public static void main(String[] args) {
    int a = 10;
    float b = 7;
    float result = a / b;//데이터 종류가 다르기때문에 암시적 형변환 수행
    System.out.println(result);

    byte b1 = 10, b2 = 20;
    //byte b3 = b1 + b2; //b1과 b2의 값은 암시적으로 int로 형변환 된다.
    int result2 = b1 + b2;


    byte b4 = 10 + 20;
    /* 자바에서 정수 연산을 수행할 때 최소 단위가 int이다.
    => 따라서 byte, short 값을 연산할 때는 내부적으로 int로 형변환 된다음에
    연산이 수행된다.*/
    //상수끼리의 연산결과는 컴파일러가 알수 있기 때문에 값의 저장 여부를 바로 검사할
  //상수끼리의 연산결과는 컴파일러가 알수 있기 때문에 값의 저장 여부를 바로 검사할
  //수 있다. 그래서 byte메모리에 저장하는 것을 허락한다.

  //  byte b5 = 100 + 100;


  }
}
