package stackExamples;

public class Person {
	
	String name;
	int roll;
	
	Person(String name, int roll)
	
	{
		this.name = name;
		this.roll = roll;
	}
	
	public String toString()
	{
		return "Name is " + name + " and Roll is " + roll;  
	}

}
