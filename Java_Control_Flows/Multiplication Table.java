package level_2;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int a = 1;
		if(n == 6) {
			for(int i = 1; i <= 10; i++) {
				a = n * i;
				System.out.println(n + " X " + i + " = " + a);
			}
		}
		else if(n == 7) {
			for(int i = 1; i <= 10; i++) {
				a = n * i;
				System.out.println(n + " X " + i + " = " + a);
			}
		}
		else if(n == 8) {
			for(int i = 1; i <= 10; i++) {
				a = n * i;
				System.out.println(n + " X " + i + " = " + a);
			}
		}
		else if(n == 9) {
			for(int i = 1; i <= 10; i++) {
				a = n * i;
				System.out.println(n + " X " + i + " = " + a);
			}
		}
		else {
			System.out.println("Invalid number");
		}

	}

}
