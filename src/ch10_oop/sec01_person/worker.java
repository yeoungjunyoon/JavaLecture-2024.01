package ch10_oop.sec01_person;

public class worker extends person {
	int workerId;
	
	void work() {
		System.out.println(name + "이/가 일을 합니다.");
	}
}
