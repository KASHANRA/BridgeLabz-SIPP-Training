package level_1;
import java.util.*;
public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		if(a < b && a < c) {
			System.out.println("Is the first number the smallest? " + true);
		}
		else {
			System.out.println("Is the first number the smallest? " + false);
		}

	}

}
