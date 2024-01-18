package ch06_class.sec99_연습문제;

import java.util.Arrays;
import java.util.Scanner;

public class Interpark_bestseller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		String[] sArr = new String[k];
		for(int i = 0;  i<k; i++)
			sArr[i] = scan.next();
		
		Arrays.sort(sArr);
		
		int count = 0;
		int max = 0;
		String temp = sArr[0];
		String result = "";
		for(int i = 0; i < sArr.length; i++) {
			
			
			// 
		}
	}

}
