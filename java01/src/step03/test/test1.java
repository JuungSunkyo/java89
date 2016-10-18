/*QUIZ : 자바 원시타입과 String 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에  그 메모리의 값을저장하고 출력하라!
*/
package step03.test;

public class test1 {
  public static void main(String[] args){
  // 제목, 작가, 가격, 페이지수, 출판일,
   String title = "미움받을 용기";
   String publisher = "기미시 이치로";
   String language = "korean";
   String isbn = "11-123-11";
   String[] authors = {"홍길동", "임꺽정"};
   float width = 7.4f;
   float height = 9.1f;
   float thick = 1.6f;
   double price = 83.33;
   boolean dvd = false;

   System.out.println(title);
   System.out.println(publisher);
   System.out.println(language);
   System.out.println(isbn);
   System.out.println(authors[0] + ","+ authors[1]);
   System.out.println(width);
   System.out.println(height);
   System.out.println(thick);
   System.out.println(price);
   System.out.println(dvd);








  }
}
