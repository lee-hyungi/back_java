package collectionTest.hashSetTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class HashSetTest {
    public static void main(String[] args) {
        // HashSet 생성: 중복을 허용하지 않는 자료구조
        HashSet<String> mbtiType = new HashSet<String>();

        // 데이터 추가: HashSet은 순서를 보장하지 않음
        mbtiType.add("ISTP");
        mbtiType.add("ISTJ");
        mbtiType.add("ESFJ");
        mbtiType.add("INTP");
        mbtiType.add("INFP");
        mbtiType.add("ISTP"); // 이미 존재하는 값이므로 저장되지 않음
        mbtiType.add("ESFP"); // 중복이 아니므로 저장됨

        // Iterator를 사용해서 데이터 순차 접근
        // HashSet은 순서가 없기 때문에 Iterator로 순서를 부여하여 접근 가능
        Iterator<String> iter = mbtiType.iterator();
        while (iter.hasNext()) {
            String mbti = iter.next();
            if (mbti.equals("ISTP")) { // 특정 값 검색
                System.out.println(mbti); // ISTP 출력
                break; // 찾았으므로 반복 종료
            }
        }
        
        // ArrayList에서 중복된 데이터 제거
        // 1. ArrayList 생성
        ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 10, 10, 10));
        // 2. HashSet으로 변환하여 중복 제거
        datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
        // HashSet → ArrayList로 다시 변환 (순서는 보장되지 않음)
        System.out.println(datas); // 중복 제거된 리스트 출력
    }
}
