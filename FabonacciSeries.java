/* n fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. */

public class FabonacciSeries{

	//method for Fabonacci Series:
	public void Fabo(int count){		//length of total numbers=count
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
		for(int i=2; i<count; i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;			// n1=1
			n2=n3;			// n2=1
		}
	}
	
	
	public static void main(String args[]){
		FabonacciSeries fs= new FabonacciSeries();
		fs.Fabo(10);
	}

}