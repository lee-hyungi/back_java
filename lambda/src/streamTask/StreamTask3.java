package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {

    public boolean isOdd(int num) {
        return num % 2 == 1;
    }

    public int multipleBy10(int num) {
        return num * 10;
    }

    public static void main(String[] args) {
//		IntStream으로 시작
//		10, 30, 50, 70, 90만 ArrayList 또는 List에 추가하기
    	
        StreamTask3 st = new StreamTask3();
//      리턴타입 적기
        List<Integer> datas /*List */ = IntStream //IntStream 
                .rangeClosed(1, 10) // IntStream 
                .filter(st::isOdd)  // IntStream 
                .map(st::multipleBy10) // IntStream 
                .boxed() // Stream<Integer>
                .collect(Collectors.toList()); // List<Integer>

        System.out.println(datas); // [10, 30, 50, 70, 90]
    }
}
