package OperaterTest;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
//		3개의 입력값 중 중간값 찾기
//		17 25 35
//		10 3 8
//		입력: 10 3 8
//		출력예시: 중간값: 8
		
		Scanner sc = new Scanner(System.in);
		
		String message = "3개의 정수를 입력하시오. ex) 10 20 30";
		int num1 = 0, num2 = 0, num3 = 0, result1 = 0, result2 = 0, result3 = 0, result4 = 0;
		
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
		// 10 // 20 // 30
		result1 = num1 > num2 ? num1 : num2; 
		result2 = num2 > num1 ? num1 : num2; 
		result3 = result1 > num3 ? num3 : result1; 
		result4 = result3 > result2 ? result3 : result2;
		
		System.out.println(result4);
	}
}
