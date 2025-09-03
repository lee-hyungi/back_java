package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {

	public void getOdd(Integer n) {
		if (n % 2 != 0) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {

//		IntStream
//		.range(시작, 끝): 마지막을 포함하지 않는다
//		.rangeClosed(시작, 끝): 마지막을 포함한다.
//		0~9

		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
		IntStream.rangeClosed(0, 10).forEach((n) -> {
			datas.add(n);
		});
//		
//		System.out.println(datas);

//		1~5까지 스트림 문법으로 출력하기 .forEach 기능
//		IntStream.rangeClosed(1, 5).forEach((n) -> {System.out.println(n);});

//		참조형 문법
//		.(소속::문법명)
//		IntStream.rangeClosed(1, 5).forEach(System.out::println);

//		datas 짝수만 출력하기
//		System.out.println(datas);

		datas.stream().forEach((n) -> {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
		});

//		단, 위에 방버은 사용할 수 없다.
//		datas 홀수만 출력하기
//		System.out.println(datas);
//		datas.stream().filter(n -> n % 2 == 1).forEach((n) -> System.out.println(n));

		StreamTest st = new StreamTest(); // 인스턴스 생성
		datas.forEach(st::getOdd); // 이제 참조 가능

//      .stream(): 컬렉션을 Stream 객체로 변경
//      .chars(): 문자열을 Stream 객체로 변경
		"ABCD".chars().forEach((c) -> {
			System.out.println((char) c);
		});

	}
}
