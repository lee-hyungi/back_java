package methodTest;

// 1. 1 ~ 10까지 출력해주는 메서드 선언
// 2. 1번 메서드 사용
public class MethodTask1 {
	void printOnetoTen() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.printOnetoTen();
	}
}
