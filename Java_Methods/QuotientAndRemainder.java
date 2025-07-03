package level_1;
import java.util.*;
public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		int [] r = Divide(n1, n2);
		System.out.println("The quotient is: " + r[0]);
		System.out.println("The remainder is: " + r[1]);
	}
	public static int [] Divide(int a, int b) {
		int q = a / b;
		int r = a % b;
		return new int [] {q, r};
	}
}
