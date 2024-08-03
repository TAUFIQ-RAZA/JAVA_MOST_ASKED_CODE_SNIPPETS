//4 . Given number prime number or not

public class PrimeNumber{

	public static void main(String args[]){
	
		int n = 11;
		int count =0;
		if(n ==0 || n==1){ // also can provide n<2
			System.out.println("It is Not Prime number");
		}
		
		for(int i=2; i<=n ; i++ ){
			if(n % i == 0){
				count++;
			}
		}
		
		if(count<2){
			System.out.println("The given number is prime:"+n);
		}else{
			System.out.println("The given number is Not prime:"+n);
		}
		
	}


}