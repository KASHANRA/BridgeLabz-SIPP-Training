package level_2;
import java.util.*;
public class FizzBuzz_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		while(n > 0) {
			if(n % 3 == 0 && n % 5 == 0) {
				System.out.println("FizzBuzz");
				break;
			}
			else if(n % 3 == 0) {
				System.out.println("Fizz");
				break;
			}
			else if(n % 5 == 0) {
				System.out.println("Buzz");
				break;
			}
			else {
				int i = 1;
				while(i <= n) {
					System.out.print(i + " ");
					i++;
				}
				break;
			}
		}
	}
}
