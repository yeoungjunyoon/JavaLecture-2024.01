package Ch09_modifier.sec03_static;

public class sample {
	int instanceField;
	public static int final int STATIC_FIELD = 1234;
	
	void instanceMethod() {
		System.out.println("instance method");
	}
	static void staticMethod() {
		System.out.println("static method");
	}
}

