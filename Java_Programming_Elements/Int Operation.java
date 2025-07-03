package level01;
import java.util.*;
public class Seventeenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		System.out.println("The results of Int Operations are " + (a + b * c) + " , " + (a * b + c) + " , " + (double)c + a / b + " and " + (a % b + c));
	}

}
