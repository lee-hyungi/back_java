package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.sql.rowset.Joinable;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class StreamTask4 {
	
	public void introduce(Member member) {
	    String intro = "이름: " + member.getName() + "\n" +
	                   "취미: " + member.getHobby() + "\n" +
	                   "소개: " + member.getIntroduce();
	    System.out.println(intro);
	}
	
	
	
	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<Member>();

		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요^^");

		Member[] memberaArray = new Member[] { member1, member2, member3, member4, member5, member6, member7 };
		members.addAll(Arrays.asList(memberaArray));
//		for(Member member: memberaArray) {
//			members.add(member);
//		}

//		System.out.println(members);
//		1) 각 Member의 취미를 검토하시오.
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력하시오. .contains(입력값)

//		members.stream().filter(n -> n.getHobby().contains("개발")).forEach(System.out::print);

//		2) 각 Member의 취미를 검토하시오.
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를
//		개발자 OOO(이름)으로 변경 후 모두 출력하시오.

		members.stream().filter(n -> n.getHobby().contains("개발")).map(n -> "개발자:" + n.getName())
				.forEach(System.out::println);

//		3) 취미를 3개 이상 가진 사람의 id를 출력
		members.stream().filter(n -> n.getHobby().split("_").length >= 3).forEach(n -> {
			System.out.println(n);
		});

//		4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
//		hobbyIds를 출력

		ArrayList<Long> hobbyIds = members.stream().filter(n -> n.getHobby().split("_").length >= 3) // Stream<member>
				.map(n -> n.getId()) // Stream
				.collect(Collectors.toCollection(ArrayList::new)); // Stream<ArrayList>
		// hashmap
		System.out.println(hobbyIds);
		System.out.println(members);

//		5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기

//		hobbyIds [0, 1 ,5]에서 members에 있는 id 0, 1, 5와 같으면 Introduce 출력
//		members.stream().filter(id -> id.getId() == 0).forEach(id -> System.out.println(n.getIntroduce()));

//		1. forEach 안에서 바로 처리 (가장 단순)
//		hobbyIds.forEach(n ->
//	    members.stream()
//	           .filter(m -> m.getId() == n)
//	           .forEach(m -> System.out.println(m.getIntroduce()));
	    

//		2. mapToInt → map 체인
		hobbyIds
			.stream()
			.mapToInt(Long::intValue) // Long -> int - IntStream
			.mapToObj(Integer::valueOf) // int -> Integer - Stream<Integer>
			.map(i -> members.get(i))
			.map(u -> u.getIntroduce())
			.forEach(System.out::println);
		
//		6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//		출력 예시)
//			이름: 흰둥이
//			취미: 개발_축구_농구
//			소개: 개발도 운동도 다 잘해요!
		Member member = members
				.stream()
				.max(Comparator.comparingInt(m -> m.getIntroduce().length()))
				.get();
		
		StreamTask4 st = new StreamTask4();
		st.introduce(member);
		
		
//      최대 길이      
      for(Member m : members) {
         int length = m.getIntroduction().length(); 
         if(maxLength < m.getIntroduction().length()) {
            maxLength = length;
         }
      }
      
      MaxLength maxClass = new MaxLength();
      for(Member m : members) {
         int length = m.getIntroduce().length(); 
         if( maxClass.getSize() < m.getIntroduce().length()) {
            maxClass.setSize(length);
         }
      }
      
//      filter로 걸러낸다
      members
         .stream()
         .filter(m -> m.getIntroduce().length() == maxClass.getSize())
         .forEach(st::introduce);
	}
}

