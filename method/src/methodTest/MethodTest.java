package methodTest;

public class MethodTest {
	
	void printName(String name) {
		System.out.println(name);
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
//	1. 3개의 정수를 받아서, 모두 뺀 값을 반환해주는 메서드 선언
	int subtract(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
//	2. 성과 이름을 붙여서 출력해주는 메서드 선언
	void printFullName(String lastName, String firstName) {
		String fullName = lastName + firstName;
		System.out.println(fullName);
	}
	
	
	public static void main(String[] args) {
//		클래스 안에 메서드
//		메서드
		MethodTest mt = new MethodTest();
		mt.printFullName("홍", "길동");
	}
	
}








