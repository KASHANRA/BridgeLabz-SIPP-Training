package level_1;
import java.util.*;
public class DivideNNumberOfChocolates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of students: ");
		int n = sc.nextInt();
		System.out.print("Enter no. of chocolates: ");
		int m = sc.nextInt();
		int [] result = Divide(n, m);
		System.out.println("Each child will get " + result[0] + " chocolates");
		System.out.println("Remaining chocolates are: " + result[1]);
		
	}
	public static int [] Divide(int a, int b) {
		int c = a / b;
		int d = a % b;
		return new int[] {c, d};
	}
}
