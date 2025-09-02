package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
//		메서드 선언
		MyInter myInter = new MyInter() {
			
			@Override
			public void getString(String content) {
				char[] chars = content.toCharArray();
				for(char c: chars) {
					System.out.print((char)(c > 66 ? c + 1 : c));
				}
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				return null;
			}
		};
		
//		메서드 사용
		myInter.getString("ABCD");
		
	}
}
