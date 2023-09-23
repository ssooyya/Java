package arrayListTask_teacher;

public class T_CoffeeTest {
   public static void main(String[] args) {
      
      T_CafeService t = new T_CafeService();
      T_Coffee c1 = new T_Coffee("아메리카노", 2500, false);
      T_Coffee c2 = new T_Coffee("딸기스무디", 3500, true);
      T_Coffee c3 = new T_Coffee("복숭아이스티", 2500, false);
      T_Coffee c4 = new T_Coffee("카페라떼", 3500, true);
      T_Coffee c5 = new T_Coffee("밀크티", 4500, false);
      
      t.add(c1);
      t.add(c2);
      t.add(c3);
      t.add(c4);
      t.add(c5);
      
      System.out.println(T_CafeService.menus);
      
      t.remove("딸기스무디");
      System.out.println(T_CafeService.menus);
      
      if(t.updatePrice("희한한거")) {
         System.out.println(T_CafeService.menus);
      } else {
         System.out.println("해당 메뉴가 없습니다.");
      }
      
      System.out.println(t.sell("카페라떼"));
   }
}