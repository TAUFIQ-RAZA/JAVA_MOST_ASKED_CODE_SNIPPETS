//2 . Find the given numbers is Even Or Odd in array and print in.

public class EvenOddInArray{

	public static void main(String args[]){
	
		int n[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		/* first way 
		for(int i =0 ; i<n.length; i++){
			if(n[i] % 2 == 0){
				System.out.println("The given number in array:"+n[i]+" is 'Even'");
			}else{
				System.out.println("The given number in array:"+n[i]+" is 'Odd'");
			}
		}
		
		*/
		System.out.println("The list of Even Number array:");
		for(int i =0 ; i<n.length; i++){
			if(n[i] % 2 == 0){
				System.out.println(n[i]);
			}
		}
		
		System.out.println("The list of Odd Number array:");
		for(int i =0 ; i<n.length; i++){
			if(n[i] % 2 == 1){
				System.out.println(n[i]);
			}
		}
		
		
	}
}