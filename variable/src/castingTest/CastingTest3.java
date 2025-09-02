package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		int a = 0;
		char b = ' ';
		String c = "";
		
//		문자열의 강제 형변환
//		System.out.println((int)"10");
		System.out.println(Integer.parseInt("10") - 5);
		System.out.println(Float.parseFloat("10"));
		System.out.println(Double.parseDouble("10"));
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("TRUE"));
	}
}
