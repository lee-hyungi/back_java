package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//	   	1. Arrays.asList() 초기값으로 넣는 방법
//		ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		Integer total = 0;
//		for (Integer n : datas1) {
//			total += n;
//		}
//		System.out.println(total);

//	   	2. IntStream
		
//		IntStream
//		IntStream.rangeClosed(1, 6).map(n -> n * 10).forEach(datas1::add);
//		Integer result = datas1.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(result);
		
//		리턴타입 적기
		int total =	IntStream
			.rangeClosed(1, 6) // IntStream
			.map(n -> n * 10) // IntStream
			.mapToObj(Integer::valueOf) // Stream<Integer> == .boxed()
			.collect(Collectors.toCollection(ArrayList::new)) // ArrayList<Integer>
			.stream() // Stream<Integer>
			.mapToInt(Integer::intValue) // IntStream
			.sum(); // int
		
		System.out.println(total);
	
		
//		Stream<T> 
//		.mapToInt(): Stream<T> -> IntStream
//		.mapToObj(): IntStream -> Stream<T> 
//		.mapToInt(Boolean::booleanValue): Boolean -> boolean
//		.mapToInt(Double::doubleValue): Double -> double
//		.mapToInt(Long::longValue): Long -> long
		
		
		
		
		
		
		
		
		
	}
}
