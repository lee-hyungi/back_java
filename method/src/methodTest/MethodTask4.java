package methodTest;

import java.util.Scanner;

// 1. 사용자에게 이름과 반복 횟수를 받아서 반복 횟수만큼 이름을 출력해주는 메서드
// 2. 1번 메서드 사용
// 입력 예시) 홍길동 5
// 출력 예시) 홍길동 5번 출력
public class MethodTask4 {
	void printNameByCount(String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		String message = "이름과 출력횟수를 입력하세요.\nex)홍길동 5", name = null;
		int count = 0;
		
		System.out.println(message);
		name = sc.next();
		count = sc.nextInt();
		
		mt4.printNameByCount(name, count);
		
	}
}





