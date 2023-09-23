package arrayListTask_teacher;

public class T_Coffee {
//   메뉴 이름, 가격, 할인 유무
//   name, price, sale
   private String name;
   private int price;
   private boolean sale;
   
//   기본 생성자
   public T_Coffee() {;}

//   초기화 생성자
   public T_Coffee(String name, int price, boolean sale) {
      this.name = name;
      this.price = price;
      this.sale = sale;
   }
   
//   게터, 세터
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public boolean isSale() {
      return sale;
   }

   public void setSale(boolean sale) {
      this.sale = sale;
   }

//   toString() 재정의
   @Override
   public String toString() {
      return "T_Coffee [name=" + name + ", price=" + price + ", sale=" + sale + "]";
   }
}