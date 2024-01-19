package ch06_class.sec12_lnterpark;

public class InterparkMain {
	public static void main(String[] args) {
		InterparkBook[] interparkBookArray = {
			new InterparkBook (1, "처음부터 시작하는 주식투자 단타 전략", "홍인기", null, "갈벗", 18900),
			new InterparkBook (2, "마흔에 읽는 쇼펜하우어", "강용수", null, "유노북스", 15300),
			new InterparkBook (3, "세이노의 가르침", "세이노", null, "데이원", 6480),
			new InterparkBook (4, "남에게 보여주려고 인생을 낭비하지 마라", "쇼펜하우어","박재현","페이지2북스",15750),
			new InterparkBook (5, "어른의 국어력", "김범준", null , "프레스트북스", 15120),			
 	};
	for (InterparkBook ib: interparkBookArray)
		System.out.println(ib);
	}
}