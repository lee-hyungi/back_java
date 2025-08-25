package classTest;

// 추상화
public class ClassTest {

// 필드, 필드 변수, 멤버, 멤버 변수
   String name;
   int age;
   
//   기본 생성자
   public ClassTest() {;}
   
//   초기화 생성자
   public ClassTest(String name, int age) {
//   this 자기자신의 주소값
      this.name = name;
      this.age = age;
   }
   
   public static void main(String[] args) {
//    객체화
      ClassTest ct1 = new ClassTest("홍길동", 20);
      ClassTest ct2 = new ClassTest("김길동", 20);
      ClassTest ct3 = new ClassTest();
      System.out.println(ct1.name);
      System.out.println(ct2.name);
   }
}

//생성자: 클래스가 생성되고 힙메모리에 할당시키고 그 할당된 주소를 리턴(반환)해주는 거