package level_2;
import java.util.*;
public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println("Even number is: " + i);
			}
			else {
				System.out.println("Odd number is: " + i);
			}
		}
	}
}
