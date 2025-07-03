package level_2;
import java.util.*;
public class FindtheFactors_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
