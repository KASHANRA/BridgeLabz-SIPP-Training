package level_1;
import java.util.*;
public class Collinear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
		int x1 = sc.nextInt();
		System.out.print("Enter x2: ");
		int x2 = sc.nextInt();
		System.out.print("Enter x3: ");
		int x3 = sc.nextInt();
		System.out.print("Enter y1: ");
		int y1 = sc.nextInt();
		System.out.print("Enter y2: ");
		int y2 = sc.nextInt();
		System.out.print("Enter y3: ");
		int y3 = sc.nextInt();
		System.out.println("The points are collinear using slope formula " + Slope(x1, x2, x3, y1, y2, y3));
		System.out.println("The points are collinear using area formula " + Area(x1, x2, x3, y1, y2, y3));
	}
	public static boolean Slope(int a, int b, int c, int d, int e, int f) {
		double ab = (double)(e - d) / (b - a);
		double bc = (double)(f - e)/ (c - b);
		if(ab == bc) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean Area(int a, int b, int c, int d, int e, int f) {
		double ar = 0.5 * (a * (e - f) + b * (f - d) + c * (d - e));
		if(ar == 0.0) {
			return true;
		}
		else {
			return false;
		}
	}
}
