package level_1;
import java.util.*;
public class Tenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		double s = 0;
		while(true) {
			System.out.print("Enter number: ");
			n = sc.nextDouble();
			if(n == 0) {
				break;
			}
			s = s + n;
		}
		System.out.println(s);
	}
}
