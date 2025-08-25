package methodTest;

public class MethodTask6 {
	
//	.replace(문자열, 대체할 문자열)
//	.replaceAll(문자열, 대체할 문자열)
//  1. 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
//  2. 1번 메서드 사용
	               
//	int getCount(String value, char c) {            
//	      return value.length() - value.replaceAll(String.valueOf(c), "").length();
//	   }
	
// 문자열(value)과 찾을 문자(target)를 입력받는다.
// count = 0 변수를 만든다. (찾은 개수를 세기 위해)
// 반복문을 사용한다 → for(int i = 0; i < value.length(); i++) {
// char c = value.charAt(i); → i번째 글자를 꺼낸다.
// if(c == target) → 만약 그 글자가 찾는 문자와 같으면
// count++; → 개수를 하나 증가시킨다.
// 반복문이 끝나면 count를 반환한다.
	
	int getCharTarget (String value, char target) {
		int count = 0;
		for(int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if(c == target) {
				count++;
			}
		}
		return count;
	}
	
//	void getCharTarget (String value, char target) {
//		int count = 0;
//		for(int i = 0; i < value.length(); i++) {
//			char c = value.charAt(i);
//			if(c == target) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
	
	
	
	
	public static void main(String[] args) {
//		 int count = 0 ;
//	      count = mt.getCount("abcdeaaa", 'a');
//	      System.out.println(count);
		
		MethodTask6 mt = new MethodTask6();
		System.out.println(mt.getCharTarget("가가가나나나ㅏ나가", '가'));
//		mt.getCharTarget("가가가가나나나가", '가');
	
	 
	}
}
