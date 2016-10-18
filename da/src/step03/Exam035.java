package step03;

public class Exam035 {
  static class Score {
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    }
  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();

    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = s2.sum / 3;

    System.out.println(s1.aver);
    System.out.println(s2.aver);
    
  }
}
