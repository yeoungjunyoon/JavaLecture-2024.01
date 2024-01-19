package ch10_oop.sec01_person;

public class Main {

	public static void main(String[] args) {
		// person 객체
		person person = new person();
		person.name = "제임스"; person.age = 27;
		person.eat(); person.sleep();
		
		// Student 객체
		student student = new student();
		student.name = "마리아"; student.age = 23;		// 부모 필드
		student.studentId = 1234;
		student.eat(); student.sleep(); 				// 부모 메소드
		student.study();
		
		// worker 객체
		worker worker = new worker();
		worker.name = "브라이언"; worker.age = 32; 		// 부모 필드
		worker.workerId = 9876;
		worker.eat(); worker.sleep();					// 부모 메소드
		worker.work();
	}

}
