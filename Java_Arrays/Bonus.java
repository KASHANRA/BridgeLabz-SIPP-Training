package level_1;
import java.util.*;
public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] s = new double[10];
		int [] y = new int[10];
		double [] n = new double[10];
		int a = 0;
		double b = 0;
		System.out.print("Enter your salary: ");
		for(int i = 0; i < 10; i++) {
			s[i] = sc.nextDouble();
		}
		System.out.println("Enter your years of service: ");
		for(int i = 0; i < 10; i++) {
			y[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(y[i] > 5) {
				b = b + (s[i] * 0.05);
				n[a] = s[i] + b;
				a++;
			}
			else {
				b = b + (s[i] * 0.02);
				n[a] = s[i] + b;
				a++;
			}
		}
		System.out.print("Old salary is: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.print("New salary is: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		System.out.println("Total bonus to be paid is: " + b);
	}
}
