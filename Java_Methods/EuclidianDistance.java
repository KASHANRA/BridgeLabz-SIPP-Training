package level_1;
import java.util.*;
public class EuclidianDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
		int x1 = sc.nextInt();
		System.out.print("Enter x2: ");
		int x2 = sc.nextInt();
		System.out.print("Enter y1: ");
		int y1 = sc.nextInt();
		System.out.print("Enter y2: ");
		int y2 = sc.nextInt();
		System.out.println("The Euclidian Distance between the points is: " + dis(x1, x2, y1, y2));
	}
	public static double dis(int a, int b, int c, int d) {
		int r1 = b - a;
		int r2 = d - c;
		double r3 = Math.pow(r1, 2) + Math.pow(r2, 2);
		double r4 = Math.sqrt(r3);
		return r4;
	}
}
