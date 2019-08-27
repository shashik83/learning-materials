package stackExamples;

public class PersonStack {
	
	private Person[] stack;
	private int top;
	private int size;
	
	public PersonStack() {
		top = -1;
		size = 50;
		stack = new Person[50];
	}
	
	public boolean push(Person item)
	{
		top++;
		stack[top] = item;
		return true;
	}
	
	public Person pop()
	{
		return stack[top--];
	}

}
