package ch99_test20240131.Q1;

public class Q1_3 {
	
	public boolean isPrime(int num) {
	    int count = 0;
	    for(int i=1; i<=num; i++){
	        if(num%i == 0){
	        count++;
	        }
	    }
	    return count==2 ? true : false;
	}
	
}
	


