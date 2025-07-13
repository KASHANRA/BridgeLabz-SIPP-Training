package level_1;
import java.util.*;
public class StockSpanProblem {
	public static void Span(int [] a) {
		Stack<Integer> s = new Stack<>();
		int c = 1;
		for(int i = 0; i < a.length; i++) {
			for(int j = i - 1; j >= 0; j--) {
				if(a[j] <= a[i]) {
					c++;
				}
				else {
					break;
				}
			}
			s.push(c);
			c = 1;
		}
		System.out.print("Span Values: ");
		for(int i = 0; i < s.size(); i++) {
			int sp = s.get(i);
			System.out.print(sp + " ");
		}
	}
	public static void main(String[] args) {
		int [] a = {10,30,20,40,75,50};
		System.out.print("Stock Values: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Span(a);
	}
}
