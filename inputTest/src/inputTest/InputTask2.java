package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      3개의 정수를 한 번에 입력 받은 후
//      세 정수의 곱셈을 출력
//      sc.next()만 사용
		
	   String message = "정수를 입력하세요. ex)30, 40, 50", str1 = null, str2 = null, str3 = null, resultMessage = null;
	   int result = 0, num1 = 0, num2 = 0, num3 = 0;
	   resultMessage = "첫번째 정수: %s, 두번째 정수: %s, 세번째 정수: %s\n세 정수의 곱은: %d";
	   
	   System.out.println(message);
	   str1 = sc.next();
	   str2 = sc.next();
	   str3 = sc.next();
	   
	 num1 = Integer.parseInt(str1);
	 num2 = Integer.parseInt(str2);
	 num3 = Integer.parseInt(str3);
	 result = num1 * num2 * num3;
	 
	 System.out.printf(resultMessage, num1, num2, num3, result);
	   
	   
		
		
	}
}
