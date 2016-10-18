//주제 : 연산자 - 산술연산자 : 강제로 데이터 유형을 바꾸기 : 암시적 형변환
package step04;

public class Exam036_3 {
  public static void main(String[] args) {
    int a = 10, b = 7;


    float result = (float)a / b; //암시적으로 b에대해 float  형변환을 수행
    System.out.println(result);//1.xxxx

  //  명시적 형변환 후
    result = a / (float)b;
    System.out.println(result);

    int v1 = 100;
    long v2 = 200;
    //int result2 = v1 + v2; //v1에 대해 long으로암시적 형변환이 일어난다
                          //결과값의 종류는  long 이다.
                          //그래서 int메모리 resuslt2에 저장할수 없는 것이다.
                          //컴파일단계에서 확인 가능,컴파일 오류





    //연산은 반드시 같은 종류의 데이터에 대해서만 수행할 수 있다.
    //만약 피연산자의 종류가 다르마녀, 자바는 다음 규칙에따라 자동 현변환을 수행
    //byte,short ==>int -->flong -->float(주의)-->double
  /*  예)int + long = (long)int +long = long
    byte + short =(int)byte + (int)short = int
    byte +l*/
  }
}
