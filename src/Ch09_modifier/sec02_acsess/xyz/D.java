package Ch09_modifier.sec02_acsess.xyz;

import Ch09_modifier.sec02_acsess.abc.A;

public class D  extends A{
	void xyz() {
		A a = new A();
		System.out.println(a + b);		// 다른 패키지 A 클래스의 a, b 변수 사용가능
	}
}
