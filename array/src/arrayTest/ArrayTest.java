package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arData1 = { 1, 2, 3, 4 }; // 값을 알고있을때 {, , ,}
		
//		메모리 heap에 할당시키는 동시에 초기화 시켜주는 연산자 new // 동적 
		int[] arData2 = new int[5]; // 값은 모르고 칸만 알고있을때
		int[] arData3 = null; // 주소의 초기값 // 값도 모르고 칸수도 모를때
		
//		System.out.println(arData1);
//		System.out.println(arData1[0]);
		
		
		for(int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
		
	}
}
