package inheritanceTask;

//	InhertanceTask에서
//	사람, 학생, 직장인 객체화 후 각 메서드 출력하기
public class InheritanceTask2 {
	public static void main(String[] args) {
		PersonTask[] persons = {
			new EmployeeTask(),
			new PersonTask(),
			new StudentTask(),
		};
	
		PersonTask p1 = new PersonTask();
		
		EmployeeTask e1 = new EmployeeTask();
		PersonTask e2 = new EmployeeTask();
		
		StudentTask s1 = new StudentTask();
		PersonTask s2 = new StudentTask();
		
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].work();
			persons[i].eat();
			persons[i].sleep();
		}

	}
}





