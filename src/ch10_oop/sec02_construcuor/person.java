package ch10_oop.sec02_construcuor;

public class person {
	String name;
	int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println(name + " 이/가 맛있는 식사를 합니다.");
		
	}
	 void sleep() {
		System.out.println(name + " 이/가 꿀잠을 잠니다");
	}
}
