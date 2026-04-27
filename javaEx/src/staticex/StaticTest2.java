package staticex;

class Counter2{ // 클래스 Counter2 생성
   static int cnt = 0; // static 변수 정수 초기값 0으로 설정 
   
   
   static void increase() { // static 메서드 increase(); 생성
      cnt++; // cnt 후위연산
   }
}

public class StaticTest2 {

   public static void main(String[] args) {
      
      // static 클래스 때문에 객체를 생성하지 않아도 불러올수 있다
      
      Counter2.increase(); // 객체를 생성하지 않고 클래스 이름으로 직접 호출하는 메서드
      Counter2.increase(); 
      
      System.out.println("cnt : "+Counter2.cnt); // Counter2 클래스의 정수 변수 cnt의 값 가져오기 
      

   }

}
