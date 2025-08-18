package formattest;

public class FormatTest {
	public static void main(String[] args) {
//		이현기
//		20
//		187
		
		String name = "이현기";
		int age = 32;
		double height = 183.5;
		
		System.out.println();
		System.out.printf("저의 이름은 %s입니다.", name);
		
		System.out.printf("저의 이름은 %s이고 , 나이는 %d, 키는 %.2fcm입니다.", name, age, height);
		
	}
}
