package ch12_interface.sec05_default;

public class Main {
	
	public static void main(String[ ] atgs) {
		A a = new B();
		a.abc();
		a.def();
		
		a = new C();
		a.abc();
		a.def();
		
		A.ghi();
		
	
	
	}

}
