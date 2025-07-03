package level_1;
import java.util.*;
public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int c = 0;
		int [] a = new int[20];
		while(n > 0) {
			a[c] = n % 10;
			c++;
			n = n / 10;
		}
		System.out.print("Reverse number is: ");
		for(int i = 0; i < c; i++) {
			System.out.print(a[i]);
		}
	}
}
