package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
    public static void main(String[] args) {
        // a ~ z 문자열로 ArrayList에 추가
        ArrayList<String> data = new ArrayList<String>();

        for(char c = 'a'; c <= 'z'; c++) {
            data.add(String.valueOf(c));
        }

        System.out.println(data);
        
//    	ArrayList<Character> data = new ArrayList<>();
//
//    	for (int i = 0; i < 26; i++) {
//    	    data.add((char)(i + 97));   // 'a'~'z'
//    	}
//
//    	System.out.println(data);
        
        
//        ArrayList<Integer> data = new ArrayList<>();
//
//        // 1) 0~25 숫자 추가
//        for (int i = 0; i < 26; i++) {
//            data.add(i); // 0~25
//        }
//
//        // 2) 숫자를 문자(a~z)로 변환해서 출력
//        ArrayList<String> letters = new ArrayList<>();
//        for (int num : data) {
//            letters.add(String.valueOf((char)(num + 97))); // 0 → 'a', 1 → 'b', ...
//        }
//
//        System.out.println(letters);

    }
}
