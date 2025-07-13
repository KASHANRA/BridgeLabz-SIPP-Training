package level_1;
import java.util.*;
class Stack2{
	Stack<Integer> s1;
	
	Stack2(){
		s1 = new Stack();
	}
	
	public void Sort(Stack<Integer> s) {
		if(!s.isEmpty()) {
			int t = s.pop();
			Sort(s);
			inorder(s, t);
		}
	}
	
	public void inorder(Stack<Integer> s, int v) {
		if(s.isEmpty() || v > s.peek()) {
			s.push(v);
		}
		else {
			int te = s.pop();
			inorder(s, v);
			s.push(te);
		}
	}
}
public class SortStackUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        System.out.println("Original Stack: " + stack);
        Stack2 sorter = new Stack2();
        sorter.Sort(stack);
        System.out.println("Sorted Stack: " + stack);
	}
}
