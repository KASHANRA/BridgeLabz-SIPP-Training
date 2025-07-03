package level_2;
import java.util.*;
public class AbundantNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int s = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				s = s + i;
			}
			else {
				continue;
			}
		}
		if(s > n) {
			System.out.println("Abundant Number");
		}
		else {
			System.out.println("Not an Abundant Number");
		}
	}
}
