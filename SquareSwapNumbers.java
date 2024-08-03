public class SquareSwapNumbers{

	public static void main(String args[]){
		
		int num[]={1,2,3,4,5,6,7,8,9,10};
		int index=1;
		
		for(int i=num.length-1; i>=0; i--){
			int squares= num[i]*num[i];
			System.out.println(index+":"+squares);
			index++;
		}
		
	}
}