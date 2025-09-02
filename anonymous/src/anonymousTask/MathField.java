package anonymousTask;


public class MathField {
	public static void main(String[] args) {
		
//		메서드 구현 후 4개의 메서드 모두 사용
		MathTask mathTask = new MathTask() {
			
			@Override
			public void printName(String name) {
				System.out.println(name);
			}
			
			@Override
			public String concat(String str1, String str2) {
				return str1 + str2;
			}
			
			@Override
			public CalcResult calc(int num1, int num2) {
				CalcResult calcResult = new CalcResult();
				calcResult.setSumResult(num1 + num2);
				calcResult.setDivResult(num1 / (double)num2);
				calcResult.setSubResult(num1 - num2);
				calcResult.setMulResult(num1 * num2);
				return calcResult;
			}
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		int result1 = mathTask.add(10, 20);
		System.out.println(result1);
		
		mathTask.printName("홍길동");
		
		CalcResult result3 = mathTask.calc(20, 30);
		System.out.println("더한 값: " + result3.getSumResult());
		System.out.println("뺀 값: " + result3.getSubResult());
		System.out.println("나눈 값: " + result3.getDivResult());
		System.out.println("곱한 값: " + result3.getMulResult());
		String result4 = mathTask.concat("성", "공");
		System.out.println(result4);
	}
}





