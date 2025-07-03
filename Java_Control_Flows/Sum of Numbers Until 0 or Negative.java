package level_1;
import java.util.*;
public class Eleventh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s = 0;
		double n;
		while(true) {
			System.out.print("Enter number: ");
			n = sc.nextDouble();
			if(n <= 0) {
				break;
			}
			s = s + n;
		}
		System.out.println(s);
	}
}
