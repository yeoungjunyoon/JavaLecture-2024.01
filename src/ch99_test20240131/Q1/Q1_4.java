package ch99_test20240131.Q1;

public class Q1_4 {

	public boolean isPrime(int num) {
	    int count = 0;
	    for(int i=3; i<=num; i++){
	        if(num%i == 0){
	        count++;
	        }
	    }
	    return count==2 ? true : false;
		}
	
	public static void main(String[] args) {
		  int sum = 0;
		  for(int i=3; i<=100; i++) {   	//i는 3~100까지 증가한다.
		    int count = 0;			//count는 소수인지 확인하는 역할은 한다.
		    for(int x=1; x<=i; x++) {		//i의 값만큼 증가하며 i에 나눠지는 수 x를 만든다 
		   	 if(i % x == 0) {		//i/x의 나머지가 0이라면, count를 증가시키는데
		   	 count++;			//소수라면 count는 3가 나온다.
		    }
		 	 }
		    if(count == 2) {			//소수라면
		   	 sum += i;			//i의 값을 sum에 더한다.
		   	 System.out.println(i+", "); 	//소수라면 현재의 값을 출력한다.
		    }
		  }
		  System.out.println("sum = "+sum);
	}
}