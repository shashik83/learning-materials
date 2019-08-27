package stackExamples;



 class Animal{
	
	public String pname = "public";
	protected String protectedname = "protected";
	private String privatename = "private";
	
	protected String returnProtectedString()
	{
		System.out.println(protectedname);
		
		return protectedname;
	}
	
	private String returnPrivateString()
	{
		System.out.println(privatename);
		return privatename;
	}}
public class Dog extends Animal{
	public static void main(String args[])
	{
		Dog d = new Dog();
		//d.returnPrivateString();
		d.returnProtectedString();
	}
	
}


