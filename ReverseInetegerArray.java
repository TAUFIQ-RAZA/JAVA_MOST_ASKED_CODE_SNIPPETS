/* Reversing a Integer Arrray */

class ReverseInetegerArray{

	public void reverse(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length-1; j++){
				if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		 }
	   }
	   System.out.print("The Reverse Array is:");
	   for(int k=arr.length-1; k>=0; k--){
		   System.out.print(" "+arr[k]);
	   }
	}
	
	public static void main(String args[]){
		ReverseInetegerArray rv=new ReverseInetegerArray();
		int[] numbers={5,7,8,6,4,1,3,9,2,10};
		rv.reverse(numbers);
	}
}
