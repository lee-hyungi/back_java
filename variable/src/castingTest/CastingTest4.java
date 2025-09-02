package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		Integer.parseInt("10"); // 10
		Double.parseDouble("8.8"); // 8.8
		System.out.println(Boolean.parseBoolean("true"));
//		"8.8" -> 8.8 -> 8
		System.out.println((int)Double.parseDouble("8.8"));
//		"true" -> true
	}
}
