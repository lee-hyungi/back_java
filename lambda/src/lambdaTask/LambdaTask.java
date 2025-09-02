package lambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
	
//	사칙연산의 결과를 출력하는 메서드
	public void showClacResult(CalcResult calcResult) {
		System.out.println(calcResult.getDivResult());
		System.out.println(calcResult.getMulResult());
		System.out.println(calcResult.getSumResult());
		System.out.println(calcResult.getSubResult());
	}
	
	public static void main(String[] args) {
//		LambdaInter2 구현하기
//		두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드
		LambdaInter2 lambdaInter2 = (num1, num2) -> {
			CalcResult calcResult = new CalcResult();
			calcResult.setSumResult(num1 + num2);
			calcResult.setSubResult(num1 - num2);
			calcResult.setDivResult(num1 / num2);
			calcResult.setMulResult(num1 * num2);
			return calcResult;
		};
		
		CalcResult cr1 = lambdaInter2.calc(10, 5);
		CalcResult cr2 = lambdaInter2.calc(50, 5);
		
		LambdaTask lambdaTask = new LambdaTask();
		lambdaTask.showClacResult(cr1);
		lambdaTask.showClacResult(cr2);
		
	}
}
