package level_1;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of persons: ");
		int n = sc.nextInt();
		int [] h = new int[n];
		System.out.print("Enter height of persons (in cm): ");
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int [] w = new int[n];
		System.out.print("Enter weight of persons (in kg): ");
		for(int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		double [] b = new double[n];
		for(int i = 0; i < n; i++) {
			b[i] = (double) (w[i] / (h[i] * h[i] * 0.01 * 0.01));
		}
		String [] s = new String[n];
		for(int i = 0; i < n; i++) {
			if(b[i] <= 18.4) {
				s[i] = "Underweight";
			}
			else if(b[i] <= 24.9 && b[i] >= 18.5) {
				s[i] = "Normal";
			}
			else if(b[i] <= 39.9 && b[i] >= 25.0) {
				s[i] = "Overweight";
			}
			else {
				s[i] = "Obese";
			}
		}
		System.out.print("Weights are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(w[i] + " ");
		}
		System.out.println();
		System.out.print("Heights are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(h[i] + " ");
		}
		System.out.println();
		System.out.print("BMIs are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.print("Status are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
