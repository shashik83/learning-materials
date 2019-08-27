package stackExamples;

  class A {
	    A()
	{
	    	System.out.println(4);
	}
	
	    A(int x) { 
	    	System.out.println(8); 
	    	}
	 

}


  class B extends A{ 
	   B() {
		   super(4);
		  System.out.println(5);
		  
  
  }
  
  void sum() { 
	  System.out.println("DEAD END"); 
	  } 
  }
 

public class Apple{
	
	
	public static void main(String args[])
	{
		//A a = new A();
		A b = new B();
		//B c = new B();
		
	}
	
}

