package controlStatement;

import java.util.Scanner;

public class IfTest {
   public static void main(String[] args) {
//      "백반", "돈까스", "짜장면", "우동", "해장국", "샐러드"
//      점심메뉴 입력을 받아서
//      백반이 나오면 "오늘의 점심!" 이라고 출력
//      아니라면 "잘하는 배승원 컨펌!"
      
//		원칙적으로 문자열 비교는 .equals() 써야 안전 ✅
//		학습 목적으로 == 를 써보고 싶으면 intern() 을 붙이면 된다 🔥
//		menu = menu.intern(); // 🔥 입력받은 문자열을 상수풀에 올리기
//	  	sc.next(): new String(input)
	   
      Scanner sc = new Scanner(System.in);
      String message = "점심메뉴를 입력하세요. \nex)잘하는 배승원의 베스트 메뉴!",
            menu = null;
      System.out.println(message);
      menu = sc.next();
      
      if(menu.equals("백반")) {
         System.out.println("오늘의 점심");
      }else if(menu.equals("돈까스")) {
         System.out.println("어제 먹은 돈까스 질림!");
      }else if(menu.equals("짜장면")) {
         System.out.println("잘하는 배승원의 베스트 짜장면 컨펌!");
      }else if(menu.equals("우동")) {
         System.out.println("통통한 우동! 잘하는 배승원의 먹킷리스트!");
      }else if(menu.equals("해장국")) {
         System.out.println("어제도 오늘도 해장국! 잘하는 배승원!");
      }else if(menu.equals("샐러드")) {
         System.out.println("잘하는 배승원 컨펌!");
      }else {
         System.out.println("잘하는 배승원 다이어트중!");
      }
   }
}





