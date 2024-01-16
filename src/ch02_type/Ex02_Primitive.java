package ch02_type;

public class Ex02_Primitive {

	public static void main(String[] args) {
		// boolean
		boolean a = true, b = false;
		System.out.println("a: " + a + ", b: " + b);
		
		/*
		 * 정수 계열
		 * 		1. byte:	1 바이트, -128 ~ 127
		 * 		2. short:	2 바이트, -32768 ~ 32767
		 * 		3. int:		4 바이트, -2147483648 ~ 2147483647
		 * 		4. long:	8 바이트, -2**63 ~ 2**63 - 1
		 * 주의 사항
		 * 		- 숫자값(literal)(예, -123, 57)은 기본적으로 int 타입
		 * 		- long 타입의 숫자값 뒤에는 L을 붙여야 함(15L)
		 */
		byte w = 10;
		short x = 1024;
		int y = 1000000;
		long z = 300000000L;
		System.out.printf("%d, %d, %d, %d\n", w, x, y, z);	// format, d-정수, f-실수, s-문자열

		/*
		 * 실수 계열
		 * 		1. float:	4 바이트, 유효자리 - 소숫점 이하 7자리 정도
		 * 		2. double:	8 바이트, 유효자리 - 소숫점 이하 15자리 정도
		 * 주의 사항
		 * 		- 숫자값(예, 3.14, 2.728)은 기본적으로 double 타입
		 * 		- float 타입의 숫자값 뒤에는 F를 붙여야 함(3.14F)
		 */
		float f1 = 1.0000001F, f2 = 1.00000001F;
		double d1 = 1.000000000000001, d2 = 1.0000000000000001;
		System.out.println("f1: " + f1 + ", f2: " + f2);
		System.out.println("d1: " + d1 + ", d2: " + d2);
		
		// 문자: 1 글자
		char eng = 'A', kor = '안';
		System.out.println("eng: " + eng + ", kor: " + kor);
	}

}
