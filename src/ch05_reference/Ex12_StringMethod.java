package ch05_reference;

import java.nio.charset.Charset;
import java.util.Arrays;

public class Ex12_StringMethod {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";
		
		/* 스트링의 길이 - 속성이 아니라 메소드임 */
		System.out.println(str1.length() + ", " + str2.length());

		/* 문자열 검색 */
		System.out.println(str2.charAt(0) + ", " + str2.charAt(7));	 	// 안, 반
		// 주민등록번호를 보고 남자인지, 여자인지 구별
		String ssn = "010624-4123456";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1': case '3':
			System.out.println("남자"); break;
		case '2': case '4':
			System.out.println("여자"); break;
		}
			
		System.out.println(str1.indexOf("Java") + ", " + str2.indexOf('반'));
		// 찾고자 하는 문자열이 대상 문자열에 있는지 확인
		if (str2.toLowerCase().indexOf("java") >= 0)
			System.out.println("문장 안에 java라는 글자가 있습니다.");
		
		System.out.println("apple pineapple".lastIndexOf("pp"));
		
		/* 문자열 변환 */
		boolean a = true; int b = 123; double c = 3.14; char d = 'a';
		// 명시적(explicit) 변환
		System.out.println(String.valueOf(a) + ", " + String.valueOf(b) +  ", " + 
							String.valueOf(c) + ", " + String.valueOf(d));
		// 암묵적(implicit) 변환
		System.out.println(a + ", " + b + ", " + c + ", " + d);
		
		/* 문자열 배열 변환, 문자열 --> byte[], char[] */
		byte[] byteStr1 = str1.getBytes();
		byte[] byteStr2 = str2.getBytes(Charset.defaultCharset());
		System.out.println(Arrays.toString(byteStr1));
		System.out.println(Arrays.toString(byteStr2));		// utf-8, 초성 + 중성 + 종성 각 1 바이트
		System.out.println(Arrays.toString(str2.toCharArray()));
		
		/* 문자열 내용 비교 */
		System.out.println(str1.equals("hello java"));		// 문자열 비교시 == 사용하면 안됨
		System.out.println(str1.equalsIgnoreCase("hello java"));
	}

}
