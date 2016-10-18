package step04;
public class Test02 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    System.out.printf(" %s\n", (age < 18) ? "미성년" :
      ((age >= 18 && age < 50) ? "성년" :
      ((age >= 50 && age < 65) ? "중년" : "노인")));
  }
}
