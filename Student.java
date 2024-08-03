public class Student{
	
	String name= "Taufiq";
	int[] marks={89,65,32,74,65};
	
	public void total(){
		
		int sum= 0;
		for(int i=0; i<marks.length; i++){
			sum  = sum + marks[i];
		}
		System.out.println(sum);
}
      
	  public void average(){
		  int sum= 0;
		for(int i=0; i<marks.length; i++){
			sum  = sum + marks[i];
		}
		System.out.println(sum/marks.length);
		
	  }
	  public static void main(String[] args){
		  Student std = new Student();
		  std.total();
		  std.average();
		  
		  
	  }
}
   
		 