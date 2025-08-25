package classTask;

import classTest.ClassTest;

class Market {
//   1. 상품명, 상품가격, 상품재고
//   판매(sell)
//   힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?

	String goods;
	int price;
	int stock;

	public Market() {;}

	public Market(String goods, int price, int stock) {
		super();
		this.goods = goods; // 상품명
		this.price = price; // 상품가격
		this.stock = stock; // 상품재고
	}
	
		void sell(Customer customer) {
		if(this.stock == 0) {
			System.out.println("상품재고가 없습니다.");
			return;
		}
		if(this.price < customer.sale) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		//this.price: 마켓 상품 원래가격 //customer.sale: 고객 할인율%
		int FinalPrice = this.price * (100 - customer.sale) / 100;
//		실제로 고객이 지불해야 하는 최종 금액을 의미합니다.
		
	}
	

	class Customer {
//   2. 이름, 폰, 돈, 할인율
		String name;
		int number;
		int money;
		int sale;

		public Customer() {;}
		public Customer(String name, int number, int money, int sale) {
			this.name = name;
			this.number = number;
			this.money = money;
			this.sale = sale;
		}
	}

	public class ClassTask2 {
		public static void main(String[] args) {
//	   ClassTest ct1 = new ClassTest("홍길동", 20);
			Market mk = new Market("바나나", 3000, 5);
			Customer cs = new Customer("이현기", 01011112222, 50000, 30);

//      3. 마켓, 소비자를 객체화 시키고,
//      소비자에게 마켓의 물건을 판매
//      마켓의 상품 재고와, 소비자의 남은 금액을 출력
		}

	}
}
