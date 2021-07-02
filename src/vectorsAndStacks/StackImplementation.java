package vectorsAndStacks;

import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack();
//		stack.push(12);
//		stack.push(24);
//		stack.push(36);
		
//		int popped =stack.pop();
//		popped =stack.pop();
//		popped =stack.pop();
		
//		int peeked= stack.peek();
//		System.out.println(peeked);
		
		StackImp news= new StackImp();
		
		news.push(5);
		news.push(2);
		news.push(3);
		news.push(4);
		news.display();
	}

}
