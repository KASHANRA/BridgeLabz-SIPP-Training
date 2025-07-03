package level01;
import java.util.*;
public class Fifteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter unit Price: ");
		double p = sc.nextDouble();
		System.out.print("Enter Quantity: ");
		int q = sc.nextInt();
		System.out.println("The total purchase price is INR " + (p * q) + " if the quantity is " + q + " and unit price is INR " + p);
	}

}
