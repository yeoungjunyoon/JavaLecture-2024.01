package Ch09_modifier.sec02_acsess.abc;

public class B {
	void abc() {
		A a = new A();
		System.out.println(a.a + a.b + a.c);		// A 클래스의 a,b,c 사용가능
	}

}
