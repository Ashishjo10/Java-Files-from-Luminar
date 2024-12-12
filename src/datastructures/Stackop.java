package datastructures;
import java.util.Stack;

public class Stackop {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(60);
		
		System.out.println("Top element="+stack.peek());
		
		stack.pop();
		System.out.println("Top element after pop="+stack.peek());
	}

}
