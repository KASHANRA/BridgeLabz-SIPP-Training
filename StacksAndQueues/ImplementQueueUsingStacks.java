package level_1;
import java.util.*;
class Queue{
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	public Queue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void Enqueue(int x) {
		s1.push(x);
	}
	
	public int Dequeue() {
		if(isEmpty()) {
			 throw new RuntimeException("Queue is empty");
		}
		Shift();
		return s2.pop();
	}
	
	public int peek() {
		if(isEmpty()) {
			 throw new RuntimeException("Queue is empty");
		}
		Shift();
		return s2.peek();
	}
	
	public void Shift() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
	}
	
	public boolean isEmpty() { 
		return s1.isEmpty() && s2.isEmpty();
	}
}

public class ImplementQueueUsingStacks {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		System.out.println(q.peek());
		System.out.println(q.Dequeue());
		System.out.println(q.peek());
		System.out.println(q.Dequeue());
	}
}
