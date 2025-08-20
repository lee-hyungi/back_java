package controlStatement;

public class ForTask3 {
	public static void main(String[] args) {
//		1 ~ 100까지 7의 배수의 합 구하기
//		int sum = 0;
//		
//		for(int i = 0; i < 100; i++) {
//			int value = i+1;
//			if((value) % 7 == 0) {
//				sum += value;
//			}
//		}
//		System.out.println(sum);

//		a ~ z까지 반복해서 아래의 결과를 출력한다.
//		"aBcDeFg ... Z"
//		String result = "";

//        for (int i = 97; i < 123; i++) {
//        	if(i >= 97 && i <= 122) {
//        		result += (char) i;
//        	}
//        	if (i >= 97 && i <= 123) {
//        		result += (char) (i - 32);
//        	}
//        }

		String result = "";

		for (int i = 0; i < 26; i++) {
			if ((i + 1) % 2 == 0) {
				result += (char) (i + 65);
			} else {
				result += (char) (i + 97);
			}
		}
		System.out.println(result);

		for (int i = 0; i < 26; i++) {
			// 짝수 → 소문자, 홀수 → 대문자
			char ch = (char) ((i % 2 == 0 ? 97 : 65) + i);
			System.out.print(ch);
		}

//      "aBcDeFg ... Z"
//      'a': 97
//      'A': 65
//      for(int i = 0; i < 26; i++) {
//         System.out.print((char)((i % 2 == 0 ? 97 : 65) + i));
	}
}
