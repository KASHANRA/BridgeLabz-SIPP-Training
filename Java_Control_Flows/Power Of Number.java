package level_2;
import java.util.*;
public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.print("Enter power: ");
		int p = sc.nextInt();
		int r = 1;
		for(int i = 1; i <= p; i++) {
			r = n * r;
		}
		System.out.println(r);
	}
}
