package stackExamples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Person p1 = new Person("Shashi",1); Person p2 = new Person("Amresh",2);
		 * 
		 * PersonStack stack = new PersonStack(); stack.push(p1); stack.push(p2);
		 * 
		 * System.out.println(stack.pop()); System.out.println(stack.pop());
		 */
		
		Intq queue = new Intq();
		System.out.println(new Intq());
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println('J' + 'A');
	}

}
