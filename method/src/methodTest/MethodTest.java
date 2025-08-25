package methodTest;

public class MethodTest {

//	1. 3개의 정수를 받아서, 모두 뺀 값을 반환해주는 메서드 선언

	int threeNum(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}

//	2. 성과 이름을 붙여서 출력해주는 메서드 선언
	
	void fullName(String last, String first) {
		
		String fullName1 = last + first;
		System.out.println(fullName1);
	}

	public static void main(String[] args) {
//		클래스를 정의할수 있는건 그 클래스 밖에 없다.
//		클래스 안에 메서드
//		메서드
//		힙모리에 올린다. new사용 -> new MethodTest();
		MethodTest mt = new MethodTest();
		mt.fullName("이", "현기");
	}
}
