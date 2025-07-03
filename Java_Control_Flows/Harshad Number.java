package level_2;
import java.util.*;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int m = n;
		int s = 0;
		int a;
		while(n == 0) {
			System.out.println("Not a Harshad Number");
		}
		while(n != 0) {
			a = n % 10;
			s = s + a;
			n = n / 10;
		}
		if(m % s == 0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}
	}
}
