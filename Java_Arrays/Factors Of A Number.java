package level_1;
import java.util.*;
public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int [] f = new int[n];
		int a = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				f[a] = i;
				a++;
			}
		}
		for(int i = 0; i < a; i++) {
			System.out.print(f[i] + " ");
		}
	}
}
