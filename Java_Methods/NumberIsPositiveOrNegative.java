package level_1;
import java.util.*;
public class NumberIsPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = new int[5];
		System.out.print("Enter 5 numbers: ");
		for(int i = 0; i < 5; i++) {
			n[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			if(n[i] > 0) {
				Positive(n[i]);
			}
			else if(n[i] < 0) {
				System.out.println("Number is Negative");
			}
			else {
				System.out.println("Zero");
			}
		}
		Compare(n);
	}
	public static void Positive(int a) {
		if(a % 2 == 0) {
			Even();
		}
		else {
			Odd();
		}
	}
	public static void Even() {
		System.out.println("Even number");
	}
	public static void Odd() {
		System.out.println("Odd number");
	}
	public static void Compare(int [] n) {
			if(n[0] > n[4]) {
				System.out.println("1st elememnt is Greater than last element");
			}
			else if(n[0] < n[4]) {
				System.out.println("1st elememnt is Less than last element");
			}
			else {
				System.out.println("1st elememnt is equal to last element");
			}
	}
}
