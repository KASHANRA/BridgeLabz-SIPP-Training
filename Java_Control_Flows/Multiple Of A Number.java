package level_2;
import java.util.*;
public class MultipleOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		if(n < 100) {
			for(int i = 0; i < 100; i++) {
				System.out.println("Mutiple of " + n + " is: " + n*i );
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
