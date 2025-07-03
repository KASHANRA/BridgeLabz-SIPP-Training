package level_1;
import java.util.*;
public class YoungestAndTallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[3];
		int [] h = new int[3];
		System.out.println("Fistly input age followed by height");
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			h[i] = sc.nextInt();
		}
		if(a[0] < a[1] && a[0] < a[2]) {
			System.out.println("Amar is youngest");
		}
		else if(a[1] < a[0] && a[1] < a[2]) {
			System.out.println("Akbar is youngest");
		}
		else{
			System.out.println("Anthony is youngest");
		}
		if(h[0] > h[1] && h[0] > h[2]) {
			System.out.println("Amar is tallest");
		}
		else if(h[1] > h[0] && h[1] > h[2]) {
			System.out.println("Akbar is tallest");
		}
		else{
			System.out.println("Anthony is tallest");
		}
	}
}
