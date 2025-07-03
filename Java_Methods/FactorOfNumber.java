package level_1;
import java.util.*;
public class FactorOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		Factor(n);
	}
	public static void Factor(int a) {
		int [] arr = new int[25];
		int c = 0;
		int s = 0;
		int sq = 0;
		int p = 1;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				arr[c] = i;
				s = s + i;
				sq = sq + (i * i);
				p = p * i;
				c++;
			}
		}
		System.out.print("The factors of " + a + " are: ");
		for(int i = 0; i < c; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The sum of factors are: " + s);
		System.out.println("The sum of square of factors are: " + sq);
		System.out.println("The product of factors are: " + p);
	}
}
