package level_2;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int m = n;
		int s = 0;
		int r;
		while(n == 0) {
			System.out.println("Not an Armstrong Number");
		}
		while(n != 0) {
			r = n % 10;
			s = s + (r*r*r);
			n = n / 10;
		}
		if(s == m) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
