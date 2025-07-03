package level_1;
import java.util.*;
public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println("The sum of " + n + " natural numbers is: " + Sum(n));
	}
	public static int Sum(int a) {
		int b = 0;
		for(int i = 1; i <= a; i++) {
			b = b + i;
		}
		return b;
	}
}
