/*QUIZ : 클래스 문법 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에  그 메모리의 값을저장하고 출력하라!
*/
package step03.test;

public class test2 {

  static class book {
    String title;
    String publisher;
    String language;
    String isbn;
    String[] authors;
    float width;
    float height;
    float thick;
    double price;
    boolean dvd;
  }

  public static void main(String[] args){
    //2)book 데이터 타입에 따라 메모리(인스턴스)를 준비한다.
    book b = new book();
  //준비한 메모리(인스턴스)
   b.title = "미움받을 용기";
   b.publisher = "기미시 이치로";
   b.language = "korean";
   b.isbn = "11-123-11";
   b.authors = new String[] {"홍길동", "임꺽정"};
   b.width = 7.4f;
   b.height = 9.1f;
   b.thick = 1.6f;
   b.price = 83.33;
   b.dvd = false;

   System.out.println(b.title);
   System.out.println(b.publisher);
   System.out.println(b.language);
   System.out.println(b.isbn);
   System.out.println(b.authors[0] + ","+ b.authors[1]);
   System.out.println(b.width);
   System.out.println(b.height);
   System.out.println(b.thick);
   System.out.println(b.price);
   System.out.println(b.dvd);

  }
}
