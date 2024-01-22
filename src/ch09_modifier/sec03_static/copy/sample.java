package Ch09_modifier.sec03_static.copy;

public class sample {
	int instanceField;
	public static  final int STATIC_FIELD = 1234;
	
	void instanceMethod() {
		System.out.println("instance method");
	}
	static void staticMethod() {
		System.out.println("static method");
	}
}

