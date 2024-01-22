package ch12_interface.sec03_mltiple;

import ch12_interface.sec02_interface.RemoreControllable;

public class Main {
	public static void main(String[] args) {
		RemoreControllable rc = new SmartTV();
		rc.turnOn(); rc.setVolum(5)
	}

}
