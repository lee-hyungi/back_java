package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "김세환";
		int age = 20;
		double height = 199.9;
		
		System.out.println("저의 이름은 " + name + "입니다");
		System.out.printf("저의 이름은 %s입니다.", name);
		System.out.println("");
		System.out.printf("저의 이름은 %s이고, 나이는 %d, 키는 %.2fcm입니다.", name, age, height);
	}
}
