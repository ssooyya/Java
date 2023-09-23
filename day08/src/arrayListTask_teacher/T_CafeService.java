package arrayListTask_teacher;

import java.util.ArrayList;

public class T_CafeService {
//   coffee 메뉴들을 저장할 DB 선언하기!
   public static ArrayList<T_Coffee> menus = new ArrayList<T_Coffee>();
   
//   coffee 메뉴 추가
   public void add(T_Coffee t_Coffee) {
      menus.add(t_Coffee);
   }
   
//   coffee 메뉴 삭제
//   메뉴의 이름으로 삭제, 메뉴의 이름은 매개변수로 받아온다.
   public void remove(String name) {
      for (T_Coffee t_Coffee : menus) {
         if(t_Coffee.getName().equals(name)) {
            menus.remove(t_Coffee); // 요소가 삭제가 되면서, 전부 앞으로 땡겨지기 때문에 후에 반복을 돌 때 오류 발생
            return; 
         }
      }
   }
   
//   coffee 가격 수정
//   메뉴의 이름으로 가격 10% 인상, 메뉴의 이름은 매개변수로 받아온다.
   public boolean updatePrice(String name) {
      for (T_Coffee t_Coffee : menus) {
         if(t_Coffee.getName().equals(name)) {
            t_Coffee.setPrice((int)(t_Coffee.getPrice()*1.1));
            return true;
         }
      }
      return false;
   }
   
//   coffee 판매
//   메뉴의 이름으로 판매 구현! 메뉴의 이름은 매개변수로 받아온다.
//   단, sale 이 true 라면 50% 할인된 가격으로 판매.
//   판매 구현은 메뉴의 이름과 , 가격을 출력하는 형식으로 하자.
//   예) "아메리카노 : 2500원 결제 완료!"
   public String sell(String name) {
      int salePrice = 0; 
      for (T_Coffee t_Coffee : menus) {
         if(t_Coffee.getName().equals(name)) {
            if(t_Coffee.isSale()) {
               salePrice = (int)(t_Coffee.getPrice() * 0.5);
               return t_Coffee.getName() + " : " + salePrice + "원 결제 완료!";
            }
            return t_Coffee.getName() + " : " + t_Coffee.getPrice() + "원 결제 완료!";
         }
      }
      return "해당 메뉴가 없습니다.";
   }
}