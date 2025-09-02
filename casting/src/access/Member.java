package access;

// 이름, 주소, 나이
// 1. 필드
// 2. 기본생성자, 초기화생성자
// 3. private 붙이고,
// 4. getter, setter

public class Member {
	private String name;
	private String address;
	private int age;
	
	public Member() {;}
	public Member(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}








