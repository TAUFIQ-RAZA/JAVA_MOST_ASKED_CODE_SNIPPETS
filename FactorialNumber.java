/* Factorial of Numbers 
4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120
*/
public class FactorialNumber{

	//method
	public void Fact(int n){
		int fact=1;
		for(int i=n; i>0 ; i--){
			fact= fact * i;
			System.out.print(" "+i+" ");
		}
		System.out.println(" = "+fact);
	}
	
	public static void main(String args[]){
		FactorialNumber fn=new FactorialNumber();
		fn.Fact(5);
	}
}