package level_1;
import java.util.*;
public class Eight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		while(n >= 1) {
			System.out.println(n);
			n = n - 1;
		}
	}

}
