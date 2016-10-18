//주제 :  Literal
package step02;

public class Exam021 {
  public static void main(String[] args) {
    System.out.println((char)44032);
    System.out.println((char)0xAC00);
    System.out.println((char)0xac00);
    System.out.println((char)0Xac00);
    System.out.println((char)0b101011000000000);
    System.out.println((char)0b101011000000000);
    System.out.println('홍');

    int value = '홍';//홍 이라는 문자의 유니코드 값을 리턴한다.
                    // 그리고 리턴한 값을 value라는 그릇에 저장한다.
    System.out.println((char)value);

    System.out.println((char)('홍' + 1));

    System.out.println((int)'?'); //문자말고 숫자값 출력해라!
    System.out.println((int)'"');
    System.out.println((int)'\'');

  }
}
