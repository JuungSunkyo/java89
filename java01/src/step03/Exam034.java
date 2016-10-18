//주제 :  변수 선언 - 값의 종류와 메모리 크기
package step03;

public class Exam034 {
  public static void main(String[] args) {
    //1) 정수
    byte b = 127; //1byte
    short s =32_767; //2byte
    int i = 2147483647; //4byte
    long l = 9223372036854775807L; //8byte

    //2)부동소수점
    float f =3.14159f; //4byte
    double d = 3.14159; //8byte

    //3) 논리값
    boolean bool = true;
    boolean bool2 = false;

    //4) 문자
    char c = 0xAC00;
    char c2 = 44032;
    char c3 = '\uAC00';
    char c4 = '가';

    //5) 문자열(primitive 타입이 아니다. 객체 타입이다. 공식적으로 레퍼런스라 부른다.)
    String str = "홍길동";








  }
}
