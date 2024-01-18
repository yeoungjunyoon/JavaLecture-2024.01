package ch05_reference;

public class Q03_MaxPal {
	
	public static void main(String[] args) {
		int maxPal = 0, x = 0, y = 0;
		for(int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (isPalindrome(String.valueOf(mul)))	{		// "" + mul
					if (mul > maxPal) {
						maxPal = mul; x = i; y = k;
					}
				}
			}
		}
		System.out.print(x + " x " + y + " = " + maxPal);
	}
	static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	
	
	
	
	static String reverse(String str) {
		String reverseStr = "";
		for (int i = str.length() -1; i >= 0; i--)
			reverseStr += str.charAt(i);
		return reverseStr;
		
	}
}
