package ch99_test20240131.Q1;

import java.io.Console;

public class Q1_1 {
	static void Main(String[] args) {
		int sum = 0;
		System.out.println("3의 배수");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		for (int k = 1; k <= 100; k++) {
			if(k%3 == 0) {
				sum += k;
			}
		}
		System.out.println("1~100까지 중 3의 배수의 합 = " + sum);

	}
}
