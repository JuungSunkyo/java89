package step02;

public class Exam021 {
  public static void main(String[] args) {
    System.out.println((char)44032);
    System.out.println((char)0xAC00);
    System.out.println((char)0xac00);
    System.out.println((char)0b101011000000000);
    System.out.println('홍');

    int value = '홍';

    System.out.println((char)value);
    System.out.println((int)'홍' + 1);
    System.out.println((int)'?');
    System.out.println((int)'"');
    System.out.println((int)'\'');

  }
}
