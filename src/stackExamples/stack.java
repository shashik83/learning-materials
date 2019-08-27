package stackExamples;

public class stack extends Apple{
	
	public static void main(String args[])
	{
		
		  IntStack intStack = new IntStack(); 
		  intStack.push(1); 
		  intStack.push(2);
		  intStack.push(3); 
		  intStack.push(4); 
		  intStack.push(5);
		  
		  System.out.println(intStack.pop()); 
		  System.out.println(intStack.pop());
		 
		
		
	}
}




