package castingTest;

public class CastingTask3 {
	public static void main(String[] args) {
//		String.valueOf(값);
//		어떤 값을 문자열로 형변환시켜주는 메서드
		
		char a = 'a', j = 'j', k = 'k', A = 'A', J = ' ', K = ' ';
		String result = "%c, %c, %c";
		int gap = 0;
		gap = a - A;
		
		A = (char)(a - gap);
		J = (char)(j - gap);
		K = (char)(k - gap);
		
		System.out.printf(result, A, J, K);
	}
}