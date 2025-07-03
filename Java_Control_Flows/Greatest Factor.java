package level_2;
import java.util.*;
public class GreatestFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int a = 1;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				a = i;
			}
		}
		System.out.println("The greatest factor of " + n + " is " + a);
	}

}
