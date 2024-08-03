/* Prime Number : The Number which is divisible by itself only */

class Prime{

	public void FindingPrimeNumber(int n){
		boolean isPrime=true;
		for(int i=2; i<n; i++){
			if(n % i == 0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println("The Given Number is: "+n+" Prime");
		}else{
			System.out.println("The Given Number is: "+n+" Not Prime");
		}	
   }
	
	public static void main(String args[]){
		Prime prime=new Prime();
		prime.FindingPrimeNumber(4);
	}
}