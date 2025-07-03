package level01;
import java.util.*;
public class Eighteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		double a = sc.nextDouble();
		System.out.print("Enter 2nd number: ");
		double b = sc.nextDouble();
		System.out.print("Enter 3rd number: ");
		double c = sc.nextDouble();
		System.out.println("The results of Int Operations are " + (a + b * c) + " , " + (a * b + c) + " , " + (double)c + a / b + " and " + (a % b + c));
	}

}
