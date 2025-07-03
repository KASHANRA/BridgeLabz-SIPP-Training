package level_1;
import java.util.*;
public class Fourteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		long m = 1;
		while(n > 0) {
			m = m * n;
			n--;
		}
		System.out.println(m);
	}

}
