package level01;
import java.util.*;
public class Third {
	public static void main(String args[]) {
		System.out.println("Enter kilometres: ");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		System.out.println("The distance " + k + " km in miles is " + k * 1.6);
	}
}
