package level_2;
import java.util.*;
public class MultipleOfANumber_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int i = 1;
		while(i < 100) {
			System.out.print(n*i + " ");
			i++;
		}
	}
}
