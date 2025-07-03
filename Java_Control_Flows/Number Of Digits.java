package level_2;
import java.util.*;
public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int c = 0;
		while(n == 0) {
			c = 1;
		}
		while(n != 0) {
			n = n / 10;
			c++;
		}
		System.out.println(c);
	}
}
