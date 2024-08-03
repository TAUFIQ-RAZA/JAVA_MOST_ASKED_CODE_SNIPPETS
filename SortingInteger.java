/* Sorting an Integer Array */

class SortingInteger{
	public void Sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length-1; j++){
				if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		 }
	   }
	   System.out.print("The Sorted Array is:");
	   for(int k=0; k<arr.length; k++){
		   System.out.print(" "+arr[k]);
	   }
	}
	
	//main method
	public static void main(String args[]){
		SortingInteger si=new SortingInteger();
		int[] arr={5,7,8,6,4,1,3,9,2,10};
		si.Sort(arr);
	}
}