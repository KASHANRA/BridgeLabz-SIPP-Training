package level01;
import java.util.*;
public class Ninth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fees: ");
		int f = sc.nextInt();
		System.out.print("Enter discount: ");
		double d = sc.nextDouble();
		double p = f * d/100f;
		System.out.print("The discount amount is INR " + p + " and final discounted fee is INR " + (f - p));
	}

}
