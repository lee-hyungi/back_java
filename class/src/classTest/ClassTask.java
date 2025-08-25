package classTest;

public class ClassTask {

    // 필드(동물의 속성)
    String name;
    String feed;
    int age;

    // 기본 생성자
    public ClassTask() {;}// 빈 생성자

    // 초기화 생성자  // Alt + 쉬프트 + s
    public ClassTask(String name, int age, String feed) {
        this.name = name;   // 필드 초기화
        this.age = age;
        this.feed = feed;
    }

    // main 메서드: 객체 생성 및 출력
    public static void main(String[] args) {

        // 동물 객체 생성
        ClassTask ct1 = new ClassTask("토끼", 20, "당근");
        ClassTask ct2 = new ClassTask("강아지", 10, "사료");
        ClassTask ct3 = new ClassTask("고양이", 8, "츄르");

        // 출력
        System.out.println("동물이름: " + ct1.name + ", 나이: " + ct1.age + "살, 먹이: " + ct1.feed + "입니다.");
        System.out.println("동물이름: " + ct2.name + ", 나이: " + ct2.age + "살, 먹이: " + ct2.feed + "입니다.");
        System.out.println("동물이름: " + ct3.name + ", 나이: " + ct3.age + "살, 먹이: " + ct3.feed + "입니다.");
    }
}
