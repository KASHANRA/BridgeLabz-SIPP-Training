package level_1;
import java.util.*;
public class Fifteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		long m = 1;
		for(int i = n; i > 0; i--) {
			m = m * i;
		}
		System.out.println(m);
		
	}

}
