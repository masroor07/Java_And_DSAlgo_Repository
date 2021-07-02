package vectorsAndStacks;

public class StackImp {
	int[] stack;
	int top;
	 int capacity;
	
	 StackImp(){
		
	
	 capacity= 1000;
	 top=-1;
	 stack= new int[capacity];
	}
	public boolean isEmpty() {
		return(top== -1);
	}
	
	public boolean isFull() {
		return top== capacity-1;
	}
	public int push(int number) {
		if(isFull())
		{
		System.out.println("Stack is full");	
		}
		return stack[++top]= number;
	
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		return stack[top--];
	}
	
	public int peek() {
		return stack[top];
	}
	
	public void display() {
		for( int i = 0; i<=stack.length-1;i++) {
			
			}
			}
	
	
}
	

	
	
	
	
	
	
	