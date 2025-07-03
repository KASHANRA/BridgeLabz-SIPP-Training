package level_1;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int [] m = new int[10];
		for(int i = 1; i <= 10; i++) {
			m[i-1] = n * i;
			System.out.print(m[i - 1] + " ");
		}
	}
}
