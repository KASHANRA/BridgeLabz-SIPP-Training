package level_1;
import java.util.*;
public class YoungestAndTallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[3];
		int [] h = new int[3];
		for(int i = 0; i < 3; i++) {
			String s = (i == 0) ? "Amar" : (i == 1) ? "Akbar" : "Anthony";
			System.out.print("Enter age of " + s + " : ");
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			String s = (i == 0) ? "Amar" : (i == 1) ? "Akbar" : "Anthony";
			System.out.print("Enter height of " + s + " : ");
			h[i] = sc.nextInt();
		}
		Youngest(a);
		Tallest(h);
	}
	public static void Youngest(int [] a) {
		if(a[0] < a[1] && a[0] < a[2]) {
			System.out.println("Amar is Youngest");
		}
		else if(a[1] < a[0] && a[1] < a[2]) {
			System.out.println("Akbar is Youngest");
		}
		else {
			System.out.println("Anthony is Youngest");
		}
	}
	public static void Tallest(int [] h) {
		if(h[0] > h[1] && h[0] > h[2]) {
			System.out.println("Amar is Tallest");
		}
		else if(h[1] > h[0] && h[1] > h[2]) {
			System.out.println("Akbar is Tallest");
		}
		else {
			System.out.println("Anthony is Tallest");
		}
	}
}
