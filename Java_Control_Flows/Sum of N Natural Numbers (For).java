package level_1;
import java.util.*;
public class Thirteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int s = 0;
		for(int i = n; i > 0; i--) {
			s = s + i;
		}
		System.out.println(s);
	}

}
