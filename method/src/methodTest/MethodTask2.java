package methodTest;

// 1. 이름을 10번 출력해주는 메서드
// 2. 1번 메서드 사용
public class MethodTask2 {
	void printNameToTen(String name) {
		for(int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
		mt.printNameToTen("홍길동");
	}
	
}
