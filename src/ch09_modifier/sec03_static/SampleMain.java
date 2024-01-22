package Ch09_modifier.sec03_static;

public class SampleMain {

	public static void main(String[] args) {
		// 인스턴스 필드. 메소드를 사용하는 방법
		sample sample = new sample();
		
		System.out.println(sample.instanceField);
		sample.instanceMethod();
		
		// 스태틱 필드, 메소드를 사용하는 방법
		System.out.println(sample.STATIC_FIELD);
		sample.staticMethod();

	}

}
