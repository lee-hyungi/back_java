package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask1 {
	public static void main(String[] args) {

//		요구사항
//		모두 stream문법으로 사용한다.
//		for문, while문, if문 불가
//		1. 1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas1 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas1::add);
//		datas1.forEach(System.out::println);

//      1. 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach((n) -> datas1.add(n));
		System.out.println(datas1);
		
		
//		2. ABCDEF를 각각 문자별로 출력
		IntStream.range(0, 6)
			.mapToObj((n) -> (char)('A' + n))
			.collect(Collectors.toCollection(ArrayList::new))
			.forEach(System.out::println);
		

//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		
		IntStream.range(1, 101).forEach(n -> datas2.add(n));
		datas2.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.print(n));
		System.out.println();
	
//		3. 1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas3 = new ArrayList<Integer>();
//		IntStream
//			.rangeClosed(1, 50)
//			.map((n) -> n * 2 - 1)
//			.forEach(datas3::add);

//		datas3.forEach(System.out::println);
		
		
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
	
		 ArrayList<String> eng = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		 eng.stream().filter(n -> n != "D").forEach(System.out::print);
		 System.out.println();
		 
//			4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
//			IntStream
//			.range(0, 5)
//			.mapToObj((n) -> (char)(n > 2 ? 'A' + n + 1 : 'A' + n))
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		 
		 
		 
		
		
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
		 
		ArrayList<String> str  = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		str.stream().map(n -> String.valueOf(n).toLowerCase()).forEach(System.out::print);
		System.out.println();
		
		
		
		
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
		
		 ArrayList<String> firstBig = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));

		        firstBig.stream()
		                .filter(n -> Character.isUpperCase(n.charAt(0)))
		                .forEach(System.out::println);
		        System.out.println();
		
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
		        
		        
		        
		        
		        
		        
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"

	}
}
