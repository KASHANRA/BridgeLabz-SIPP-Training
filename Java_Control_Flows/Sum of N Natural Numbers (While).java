package level_1;
import java.util.*;
public class Twelfth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int s = 0;
		System.out.println((n*(n+1))/2);
		while(n > 0) {
			s = s + n;
			n--;
		}
		System.out.println(s);
	}
}
