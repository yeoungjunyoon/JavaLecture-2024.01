package ch10_oop.sec02_construcuor;

public class student extends Person {
	int studentId;
	
	public student(String name, int age, int studentId) {
		super(name, age);					// 부모의 생성자를 호출해야 함
		// TODO Auto-generated constructor stub
		this.studentId = studentId;
	}

	void study() {
		System.out.println(name + " 이/가 공부를 합니다.");
	}
}
