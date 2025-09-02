package classTest;

// 동물(ClassTask)
// 필드: 이름(name), 나이(age), 먹이(feed)
// 추상화
// 기본 생성자, 초기화 생성자
// 토끼, 강아지, 고양이 객체(객체화)
public class ClassTask {
	String name;
	int age;
	String feed;
	
//	생성자의 오버로딩
	public ClassTask() {;}
	public ClassTask(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	public static void main(String[] args) {
		ClassTask ct1 = new ClassTask("토끼", 20, "잡식");
		ClassTask ct2 = new ClassTask("강아지", 5, "잡식");
		ClassTask ct3 = new ClassTask("고양이", 2, "츄르");
		
	}
}






