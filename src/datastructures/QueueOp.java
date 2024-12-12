package datastructures;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOp {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(100);
		queue.add(200);
		queue.add(500);
		
		System.out.println("Front Element="+queue.peek());
		
		queue.remove();
		System.out.println("Front element after removal="+queue.peek());

	}

}
