// 3. Count the Even or Odd number in given Array.

public class EvenOddCount{

	public static void main(String args[]){
		
		int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		// create one counting variable 
		int evenCount =0;
		int oddCount =0;
		
		//sum of Even Odd numbers
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i =0 ; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				evenCount++;
				evenSum +=arr[i];
			}else{
				oddCount++;
				oddSum +=arr[i];
			}
		}
		System.out.println("Even Count:"+evenCount);
		System.out.println("Even Sum:"+evenSum);
		
		System.out.println("Odd Count:"+oddCount);
		System.out.println("odd Sum:"+oddSum);
	}

}