/* Reversing An Long Number */

class ReverseLongNumber{

	public void reverse(long num){
		long reminder=0L;
		long reverse=0L;
		for(; num>0 ; num=num/10){
			reminder= num %10;
			reverse= reverse *10 +reminder;
		}
		System.out.println(reverse);
	}
	
	public static void main(String args[]){
		ReverseLongNumber obj=new ReverseLongNumber();
		obj.reverse(7676356614L);
	}


}