package level_1;
import java.util.*;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		String [] a = new String[n];
		int b = 0;
		if(n <= 0) {
			System.out.println("Enter posistive number");
		}
		else if(n > 0) {
			for(int i = 1; i <= n; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					a[b] = "FizzBuzz";
					b++;
				}
				else if(i % 3 == 0) {
					a[b] = "Fizz";
					b++;
				}
				else if(i % 5 == 0) {
					a[b] = "Buzz";
					b++;
				}
				else {
					a[b] = Integer.toString(i);
					b++;
				}
			}
			for(int i = 1; i <= a.length; i++) {
				System.out.println("Position " + i + " = " + a[i - 1]);
			}
		}
	}
}
