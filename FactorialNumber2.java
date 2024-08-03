/* Finding Factorial of a Number using Recursion*/

public class FactorialNumber2{

	public int Fact(int n){
		if(n==0){
			return 1;
		}else{
			return (n * Fact(n-1));
		}
	}

	public static void main(String args[]){
		FactorialNumber2 fn=new FactorialNumber2();
		int Fact=1;
		Fact=fn.Fact(5);
		System.out.println("THE FACTORIAL IS:"+Fact);
	}
}