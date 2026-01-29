package collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TestStack {
	public static void main(String [] args)
	{
		Stack< Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(40);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(100);
		queue.add(300);
		queue.add(200);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());	
		System.out.println(queue.poll());
		
		
		
		
	}

}
