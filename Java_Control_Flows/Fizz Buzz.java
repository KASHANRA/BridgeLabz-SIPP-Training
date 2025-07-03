package level_2;
import java.util.*;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		if(n > 0) {
			if(n % 5 == 0 && n % 3 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(n % 5 == 0) {
				System.out.println("Buzz");
			}
			else if(n % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				for(int i = 1; i <= n; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
