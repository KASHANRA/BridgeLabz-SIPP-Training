package level_2;
import java.util.*;
public class PowerOfNumber_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.print("Enter power: ");
		int p = sc.nextInt();
		int r = 1;
		int i = 1;
		while(i <= p) {
			r = n * r;
			i++;
		}
		System.out.println(r);
	}
}
