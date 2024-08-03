// Find out prime number in array

public class PrimeNumberInArray{

	public static void main(String args[]){
	
		int n[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i =0 ; i<n.length; i++){
			boolean isPrime =true;
			
			for(int j = 2; j<n[i] ; j++){
				if(n[i] % j == 0){
					isPrime =false;
					break;
				}
			}
			if(isPrime){
				System.out.println("The Given number is Prime:"+n[i]);
			}
	    }
	}
}