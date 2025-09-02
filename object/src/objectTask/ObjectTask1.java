package objectTask;

// 상품 클래스를 만들고,
// toString, hashCode, Equals를 재정의하고
// 같은 상품인지 비교하기
// 상품 예시
// 이름(name): 파인애플 
// 가격(price): 20000
// 재고(stock): 15
// 원산지(mou): 필리핀

public class ObjectTask1 {
	public static void main(String[] args) {
		Fruit pineApple = new Fruit(1, "파인애플", 15000, 20, "필리핀");
		Fruit strawBerry = new Fruit(2, "딸기", 5000, 10, "한국");
		
		System.out.println(pineApple.equals(strawBerry));
		
		
	}
}
