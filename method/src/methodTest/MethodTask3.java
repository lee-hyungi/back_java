package methodTest;

// 1. 1 ~ n번까지 출력해주는 함수
// 2. 1번 메서드 사용
public class MethodTask3 {
	void printToCount(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void main(String[] args) {
		MethodTask3 mt3 = new MethodTask3();
		mt3.printToCount(10);
	}
}
