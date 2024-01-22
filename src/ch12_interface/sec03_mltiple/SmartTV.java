package ch12_interface.sec03_mltiple;

import java.util.Objects;

public class SmartTV {
	
	public class SmartTv implements RemoteControllable, Searchable {
		private int volume;

		@Override
		public void search(String url) {
			System.out.println("SmartTv가 " + url + "을/를 검색합니다.");
			
		}

		@Override
		public void turnOn {
			System.out.println("SmartTv를 켭니다.");		
		}
		
		@Override
		public void turnOff {
			System.out.println("SmartTv를 켭니다.");		
		}
	

		
		}
		
		
		
	}

}
