/*QUIZ :
*/
package step03.test;

public class test3 {

  static class Tv {
    String product;
    String manufacturer;
    String date;
    int price;
    String color;
    float width;
    float height;
    float thick;
    boolean stand;
    boolean remote;
    String guarantee;
      }

  public static void main(String[] args){
    Tv t = new Tv();

   t.product = "IPTV";
   t.manufacturer = "LG";
   t.date = "2016년 4월";
   t.color = "블랙";
   t.price = 299000;
   t.width = 726.6f;
   t.height = 491.9f;
   t.thick = 204.8f;
   t.stand = true;
   t.remote = true;
   t.guarantee = "1년";

   System.out.println(t.product);
   System.out.println(t.manufacturer);
   System.out.println(t.date);
   System.out.println(t.price);
   System.out.println(t.color);
   System.out.println(t.width);
   System.out.println(t.height);
   System.out.println(t.thick);
   System.out.println(t.stand);
   System.out.println(t.remote);
   System.out.println(t.guarantee);

  }
}
