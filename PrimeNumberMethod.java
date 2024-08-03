// Prime Number Using method

public class PrimeNumberMethod{
	
	public void Prime(int[] numbers){
		for(int i =0 ; i<numbers.length; i++){
			boolean isPrime =true;
			
			for(int j = 2; j<numbers[i] ; j++){
				if(numbers[i] % j == 0){
					isPrime =false;
					break;
				}
			}
			if(isPrime){
				System.out.println("The Prime Number is:"+numbers[i]);
			}
	    }
	}

	public static void main(String args[]){
		PrimeNumberMethod pnm=new PrimeNumberMethod();
		int[] numbers = {1,2,3,5,6,7,8,9,10,11,12,14,16,17};
		pnm.Prime(numbers);
	}
}