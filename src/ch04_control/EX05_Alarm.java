package ch04_control;

import java.util.Scanner;

public class EX05_Alarm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시간 입력> ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("분 입력> ");
		int minute = Integer.parseInt(scan.nextLine());
		scan.close();

		int newHour = hour, newMin = 0;
		if (minute >= 45)
			newMin = minute - 45;
		else {
			if (hour % 24 == 0) {
				newHour = 23;
				newMin = minute + 60 - 45;
			} else {
				newHour = hour - 1;
				newMin = minute + 60 - 45;
			}
		}
		System.out.printf("%02d:%02d%n", newHour, newMin);
		
		// Refactoring
		newHour = hour; newMin = minute - 45;
		if (minute < 45) {
			newMin = minute + 60 - 45;
			newHour = (hour % 24 == 0) ? 23 : hour - 1;
		}
		System.out.printf("%02d:%02d%n", newHour, newMin);
	}

}