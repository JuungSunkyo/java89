package step04;
public class Test01 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    System.out.printf("숫자는 %s입니다.\n",
      (num % 2 == 0) ? "짝수" : "홀수");

  }
}
