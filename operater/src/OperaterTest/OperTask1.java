package OperaterTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
//		사용자가 입혁한 값이 정수인지 실수인지 확인하여 결과를 출력하시요.
//		단 next()사용
//		입력 결과) 1.1
//		출력 결과) 실수
		Scanner sc = new Scanner(System.in);
		
		String message = "숫자를 입력하시오. ex)2.2, 2", str1 = null, result = null;
		double num1 = 0.0;
		int num2 = 0;
		
		System.out.println(message);
		str1 = sc.next(); // 문자열로 받고
		
		num1 = Double.parseDouble(str1); // 실수 문자열값을 실수로 바꾸고 그걸 num1에 저장
		num2 = (int)num1; // 실수 → 정수 변환 (소수점 버림)
		
		result = (num1 == num2) ? "정수" : "실수"; // 정수/실수 판별
	
		System.out.println(result);
	}
}