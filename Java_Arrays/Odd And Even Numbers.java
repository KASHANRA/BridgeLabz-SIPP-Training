package level_1;
import java.util.*;
public class OddAndEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int [] o = new int[n];
		int [] e = new int[n];
		int a = 0;
		int b = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				e[a] = i;
				a++;
			}
			else {
				o[b] = i;
				b++;
			}
		}
		for(int i = 0; i < b; i++) {
			System.out.print(o[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < a; i++) {
			System.out.print(e[i] + " ");
		}
	}
}
