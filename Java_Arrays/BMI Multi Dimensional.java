package level_1;
import java.util.*;
public class BMIMultiDimensional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of persons: ");
		int n = sc.nextInt();
		double [][] arr = new double[n][3];
		String [] s = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Enter weight (in kg) of " + (i + 1) + " person: ");
			arr[i][0] = sc.nextDouble();
		}
		for(int i = 0; i < n; i++) {
			System.out.print("Enter height (in cm) of " + (i + 1) + " person: ");
			arr[i][1] = sc.nextDouble();
		}
		for(int i = 0; i < n; i++) {
			arr[i][2] = (arr[i][0] / (arr[i][1] * arr[i][1] * 0.01 * 0.01));
		}
		for(int i = 0; i < n; i++) {
			if(arr[i][2] <= 18.4) {
				s[i] = "Underweight";
			}
			else if(arr[i][2] <= 24.9 && arr[i][2] >= 18.5) {
				s[i] = "Normal";
			}
			else if(arr[i][2] <= 39.9 && arr[i][2] >= 25.0) {
				s[i] = "Overweight";
			}
			else {
				s[i] = "Obese";
			}
		}
		System.out.print("The weight of persons are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i][0] + " ");
		}
		System.out.println();
		System.out.print("The height of persons are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i][1] + " ");
		}
		System.out.println();
		System.out.print("The BMI of persons are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i][2] + " ");
		}
		System.out.println();
		System.out.print("The health status of persons are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
